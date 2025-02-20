package 多线程中常用成员方法4;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {

        /**
         * public static void yield()   出让线程/礼让线程
         */


        MyThread t1 = new MyThread(); // 重写了父类的构造方法
        MyThread t2 = new MyThread();
        t1.setName("飞机");
        t2.setName("坦克");


        t1.start();
        t2.start();



    }
}
