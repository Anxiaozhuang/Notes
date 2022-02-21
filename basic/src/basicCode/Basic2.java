package basicCode;

public class Basic2 {
    private String s2 = Basic1.s1;
    {
        /**
         * 静态代码块:为什么说static块可以用来优化程序性能，是因为它只会在类加载的时候执行一次。
         */
        System.out.println("constructor static code~");
    }
}
