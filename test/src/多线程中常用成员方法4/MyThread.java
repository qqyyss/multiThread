package 多线程中常用成员方法4;

public class MyThread extends Thread{

    @Override
    public void run(){


        for (int i = 0; i < 100; i++) {

            System.out.println(getName() + "@" + i);
            //表示出让当前cpu执行权
            Thread.yield();
        }
    }
}
