import javax.lang.model.element.NestingKind;
import javax.sound.midi.Soundbank;
import java.io.PrintStream;

/**
 * java字符串String
 */

public class JavaString {
    public static void main(String[] args) {
        String e = "";
        String greeting = "hello";

        //子串
        String s = greeting.substring(0,3);
        //【0，3）左闭右开区间。out: hel

        //拼接
        String s1 = greeting + " java" + 2020;
        //print: hello java2020
        //当一个字符串于一个非字符串的值进行拼接时，后者会转换成字符串。

        //将多个字符串放在一起，用一个定界符分隔，就用join方法
        String all = String.join("/", "S", "M", "L", "XL"); //out:S/M/L/XL
        String clothingSize = String.join(",", "S", "M", "L", "XL");//out:S,M,L,XL

        /**
         * 不可变字符串，String类没有提供用于修改字符串的方法
         * 优点：编译器可以让字符串共享
         *
         * greeting = ”hello“。改成 ”help“
         * 实现方式：
         *  greeting = greeting.substring(0,3)+"p!";
         *  用提取+拼接方式实现的。
         *  原来的”hello“字符串（在堆中），被GC垃圾收集器回收
         */
        greeting = "help";

        /**
         * equals方法：判断两个字符串是否相等
         *    返回： true/false；
         */
        if ("hello".equals(greeting))
            System.out.println("same: " + greeting);
        else
            System.out.println("diff:" + greeting);

        /**
         * 空串与Null串
         * 空串是java对象，串长度：0， 内容：（空）
         * Null串表示目前没有任何对象与该变量关联。
         */

        /**
         * 码点与代码单元
         * length方法返回UTF-16编码表示的当前字符串所需的代码单元数量
         *
         * 待研究！
         *
         */
        String hello = "𝕆"; //𝕆在UTF-16中占两个代码代码单元
        System.out.println(hello.length());//2
        System.out.println(hello.codePointCount(0, hello.length()));//1
        System.out.println(hello.charAt(1));//out:?，访问的是𝕆的第二个代码单元
        //为了避免这个问题不要使用char类型
        System.out.println(hello.codePointAt(0));
        System.out.println(hello);

    }
}
