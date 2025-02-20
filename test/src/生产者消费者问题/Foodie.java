package 生产者消费者问题;

//消费者

public class Foodie extends Thread{
    @Override
    public void run(){

        while(true){
            synchronized (Desk.lock){
                if(Desk.count == 0){
                    break;
                }else{
                    if(Desk.foodFlag == 0){
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    else{
                        Desk.count--;

                        System.out.println("还能吃"+Desk.count+"碗面条");

                        Desk.lock.notifyAll();

                        Desk.foodFlag = 0;
                    }
                }
            }
        }

    }
}
