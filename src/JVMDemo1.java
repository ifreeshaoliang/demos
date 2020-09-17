/**
 * 用于理解虚拟机栈
 *
 * 设置断点到method1()这行，debug执行，逐步执行（步入）
 * 可以看到下面栈的情况：先压入(栈帧)main方法、method1、method2，然后出栈method2、method1、回到main方法。
 * 弹出栈后，方法内存就会被释放
 * 这个不需要GC垃圾回收
 *
 * 栈帧：
 *  
 */

class A{
    int a;
}

public class JVMDemo1 {
    public static void main(String[] args) throws InterruptedException {
        method1();
        //Thread.sleep(1000);
    }
    public static void method1(){
        A a = new A();
        A b = new A();
        b = a;
        a = null;
        b = null;
        //虽然说栈帧内不需要垃圾回收，但是在方法中分配对象（new了对象），那么这对象将存在堆中，在堆中会执行垃圾回收
        method2(1, 2);
    }
    public static int method2(int a, int b){
        int c = a + b;
        return c;
    }
}
