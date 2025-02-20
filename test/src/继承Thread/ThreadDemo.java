package 继承Thread;

public class ThreadDemo {
    public static void main(String[] args){

        /**
         * 1.自己定义一个类继承Thread
         * 2.重写run方法
         * 3.创建子类对象，并启动线程
         *
         * **/

        MyThread t1 = new MyThread();
        t1.setName("线程1");
        t1.start();
        MyThread t2 = new MyThread();
        t2.setName("线程2");
        t2.start();
    }

}
