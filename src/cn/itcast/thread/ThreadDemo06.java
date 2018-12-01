package cn.itcast.thread;

/*
 * .join()方法
 * A线程中调用线程B调用join方法,作用:A等待B线程执行完毕之后在继续执行
 */

public class ThreadDemo06 {

    public static void main(String[] args) throws InterruptedException {
        Thread t6 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 30; i++) {
                    System.out.println("子线程,i:" + i);
                }
            }
        });
        t6.start();
        t6.join();
        for (int i = 0; i <30 ; i++) {
            System.out.println("主线程,i:" + i);
        }
    }

}
