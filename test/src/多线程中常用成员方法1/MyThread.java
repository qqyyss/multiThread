package 多线程中常用成员方法1;

public class MyThread extends Thread{
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run(){


        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "@" + i);
        }
    }
}
