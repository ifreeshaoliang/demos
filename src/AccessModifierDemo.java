/**
 * @description: TODO
 * @author ifree
 * @date 2020/9/18 2:54
 * @version 1.0
 *
 * 这个demo用于解释
 * 访问权限修饰符（四种）public、protected、friendly、private的使用
 * 其中，friendly在java中并没有显示的声明，成员变量和方法默认情况下就是friendly权限。
 *
 * 修饰变量或方法：
 *  public：    自己、子女（同包+不同包的子女）、朋友（同一个包中的类）、其他包的类
 *  protected：自己、子女（同包+不同包的子女）、朋友（同一个包中的类）
 *  friendly：自己、子女（同包）、           朋友（同一个包中的类）（ps：不同包的类都不可访问）
 *  private：仅自己
 *
 * 修饰类：
 *  修饰类名的修饰符只有 public、abstract和 final可以。
 *  不能用protected和 private修饰类。
 *  friendly为默认的，没有显示声明。
 *  其中 public类一个Java程序只能有一个，因为 public的类名必须与文件名相一致。
 *
 */

class Father {
    public int a = 1;
    protected int b = 2;
    int c = 3;          //成员变量和方法默认情况下就是friendly权限。
    private int d = 4;
}

class Child extends Father  {
    void printTest(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
//        System.out.println(d);//Error:(32, 28) java: d 在 Father 中是 private 访问控制
    }
}
class Friend {
    void printTest(){
        Child child = new Child();
    }
}


public class AccessModifierDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.printTest();
    }
    public static void c(int a, int v, double f,double s, String c){

    }
}
