package 同步代码块;

public class MyThread extends Thread{
    static int ticket = 0;

    //锁对象，一定要是唯一的
    static Object obj = new Object();

    @Override
    public void run(){
        while(true){

            //同步代码块
            synchronized (obj){
                if(ticket < 100){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket++;
                    System.out.println(getName()+"正在卖第"+ticket+"张票");
                }else{
                    break;
                }
            }
        }
    }
}
