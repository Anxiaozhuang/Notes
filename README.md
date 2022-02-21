# Notes
基础:

abstract:
          1.不能实例化
          ⁣2.一个类可以继承多个接口
          ⁣3. 可以有自己的数据成员
          ⁣4. abstract类可以有abstract方法或非abstract，非abstract类不能有abstract方法
          ⁣5. final和abstract，private和abstract，static和abstract不能放在一起
          ⁣6. 如果非abstract类是abstract类的子类，它必须重写父类的abstract方法。
          ⁣
Interface: 
        


static class: 1. 静态内部类只能访问其外部类的【静态成员】。
              ⁣2. static不能修饰顶级类，只有内部类可以为static.

static variable: 用包名.static变量调用.很多时候会将一些只需要进行一次的初始化操作都放在static代码块中进行。

https://www.cnblogs.com/gxyandwmm/p/9478569.html
静态导入包:

final: 1.修饰类：表明这个类不能被继承
       2. 修饰方法：使用final方法的原因有两个。第一个原因是把方法锁定，以防任何继承类修改它的含义；第二个原因是效率。在早期的Java实现版本中，会将final方法转为内嵌调用。但是如果方法过于庞大，可能看不到内嵌调用带来的任何性能提升。在最近的Java版本中，不需要使用final方法进行这些优化了。
       类的private方法会隐式地被指定为final方法。
       3.修饰变量: 对于一个final变量，如果是基本数据类型的变量，则其数值一旦在初始化之后便不能更改；如果是引用类型的变量，则在对其初始化之后便不能再让其指向另一个对象。
       
rpc: （Remote Procedure Call）即 远程过程调用，说的这么抽象，其实简化理解就是一个节点如何请求另一节点所提供的服务


gRPC 一开始由 google 开发，是一款语言中立、平台中立、开源的远程过程调用(RPC)系统。
目前提供C、Java和Go语言版本，分别是grpc、grpc-java、grpc-go。
gRPC基于HTTP/2标准设计，带来诸如双向流、流控、头部压缩、单TCP连接上的多复用请求等特性。
这些特性使得其在移动设备上表现更好，更省电和节省空间占用。

在 gRPC 里客户端应用可以像调用本地对象一样直接调用另一台不同的机器上服务端应用的方法，使得您能够更容易地创建分布式应用和服务。与许多 RPC 系统类似，gRPC 也是基于以下理念：定义一个服务，指定其能够被远程调用的方法（包含参数和返回类型）。在服务端实现这个接口，并运行一个 gRPC 服务器来处理客户端调用。在客户端拥有一个存根能够像服务端一样的方法。

对于开发者而言的使用方法：
首先需要使用protobuf定义接口，即.proto文件。
然后使用编译工具生成特定的语言执行代码。
启动服务端，通过侦听指定的port，来等待Client链接请求，通常使用Netty来构建，GRPC内置了Netty的支持。
启动一个或者多个Client端，Client也是基于Netty，Client通过与Server建立TCP长链接，并发送请求；Request与Response均被封装成HTTP2的stream Frame，通过Netty Channel进行交互。



