package 继承Thread;

public class MyThread extends Thread{
    @Override
    public void run(){
        for(int i = 0;i<100;i++){
            //调用父类的getName方法
            System.out.println(getName()+"@"+i);
        }
    }
}
