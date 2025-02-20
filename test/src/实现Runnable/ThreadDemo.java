package 实现Runnable;

public class ThreadDemo {
    public static void main(String[] args){

        /**
         * 1.定义一个类实Runnable接口
         * 2.重写里面的run方法
         * 3.创建自己的类对象
         * 4.创建一个Thread类的对象并开启线程
         */


        MyRun mr = new MyRun();

        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();

    }
}
