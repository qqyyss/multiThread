package 多线程中常用成员方法2;

public class MyRun implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            //获取到当前线程的对象
            Thread t  = Thread.currentThread();

            System.out.println(t.getName()+i);
        }
    }
}
