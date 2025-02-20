package 生产者消费者问题;

//控制生产者消费者的执行
public class Desk {

    //0:有食物；1:没有食物
    public static int foodFlag = 0;

    //总个数
    public static int count = 10;

    //锁对象
    public static Object lock = new Object();
}
