package 多线程中常用成员方法3;


public class MyThread1 extends Thread{
    @Override
    public void run(){
        for(int i = 0;i<10;i++){
            //调用父类的getName方法
            System.out.println(getName()+"@"+i);
        }
    }
}