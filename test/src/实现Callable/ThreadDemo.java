package 实现Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /**
         * 特点：可以获取到多线程的运行结果
         * 1，创建一个类MyCallable实现Callable接口
         * 2.重写 call（是有返回值的，表示多线程运行的结果）
         *
         * 3.创建MyCallable对象（表示多线程要执行的任务）
         * 4.创建FutureTask对象（管理多线程运行的结果）
         * 5.创建Thread对象，并启动（表示线程）
         * **/
         // 创建MyCallable对象（表示多线程要执行的任务）
        MyCallable mc = new MyCallable();

        // 创建FutureTask对象（管理多线程运行的结果）
        FutureTask<Integer> ft = new FutureTask<>(mc);

        // 创建Thread对象，并启动（表示线程）
        Thread t1 = new Thread(ft);
        t1.start();

        // 获取多线程运行的结果
        Integer result = ft.get();
        System.out.println(result);



    }
}
