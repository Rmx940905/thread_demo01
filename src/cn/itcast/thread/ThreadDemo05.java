package cn.itcast.thread;

/*
 * 守护线程与非守护线程
 * 守护线程特征,会和主线程一起销毁
 * 非守护线程,用户创建的线程,如果主线程停掉,不会影响用户
 * t5.setDaemon(true); 设置此线程为守护线程
 */
public class ThreadDemo05 {
    public static void main(String[] args) {
        Thread t5 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 30 ; i++) {
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("子线程,i:"+i);
                }
            }
        });
        t5.setDaemon(true);//设置此线程为守护线程,与主线程一同销毁
        t5.start();

        for (int i = 0; i < 30; i++) {
            System.out.println("主线程,i:"+i);
        }
        System.out.println("主线程执行结束。。。。");
    }

}
