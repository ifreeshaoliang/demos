/**
 * @author ifree
 * @version 1.0
 * @description: TODO
 * @date 2020/9/24 15:53
 */
public class BoxingOrUnboxingDemo {
    public static void main(String[] args) {
        Integer i = 10; //装箱
        int n = i;//拆箱

        //上面两个语句，实际上是这样的，调用Integer的方法实现的
        Integer ii = Integer.valueOf(10);
        int nn = ii.intValue();


    }
}
