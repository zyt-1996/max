import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {

        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(5, Executors.defaultThreadFactory());
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        singleThreadExecutor.execute(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("单个线程1");
                System.out.println("id:"+ Thread.currentThread().getId() + "\n"
                        +"name:" + Thread.currentThread().getName());

            }
        });

        fixedThreadPool.execute(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("单个线程2");
                System.out.println("id:"+ Thread.currentThread().getId() + "\n" +"name:" + Thread.currentThread().getName());
            }
        });



    }
}
