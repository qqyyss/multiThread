package 多线程中常用成员方法3;

import 多线程中常用成员方法1.MyThread;
import 多线程中常用成员方法2.MyRun;

public class ThreadDemo {
    public static void main(String[] args){
        /**
         * final void setDaemon(boolean on) 设置为守护线程
         * 当其他非守护线程执行完毕后，守护线程会陆续结束（守护线程不一定会执行完）
         */

        MyThread1 t1 = new MyThread1(); // 重写了父类的构造方法
        MyThread2 t2 = new MyThread2();

        t1.setName("女神");
        t2.setName("备胎");

        //第二个线程设置为守护线程
        t2.setDaemon(true);

        t1.start();
        t2.start();


    }
}
