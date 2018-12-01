package cn.itcast.thread;

public class ThreadDemo03 {
    //使用匿名内部类方式
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 30; i++) {
                    System.out.println("zi,i:"+i);
                }
            }
        });
        t.start();
        for (int i = 0; i <30 ; i++) {
            System.out.println("zhu,i:"+i);
        }
    }
}
