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



