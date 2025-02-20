package 多线程中常用成员方法1;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        /**
         * String getName()                返回线程的名称
         * void setName(String name)       设置线程的名字（构造方法也可以设置名字）
         *          1、如果我们没有给线程设置名字，线程也是有默认的名字的
         *              格式：Thread-X（x序号，从0开始的）
         *          2、如果我们要给线程设置名字，可以用set方法进行设置，也可以构造方法设置
         *
         *
         * static Thread currentThread（）  获取当前线程对象
         * static void sleep （long time）  让线程休眠指定时间，单位为毫秒
         * **/

        MyThread t1 = new MyThread("飞机"); // 重写了父类的构造方法
        MyThread t2 = new MyThread("坦克");


        t1.start();
        t2.start();

        System.out.println(11111111);
        Thread.sleep(5000);
        System.out.println(22222222);

    }
}
