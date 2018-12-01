package cn.itcast.thread;

public class ThreadDemo02 {

    //使用实现runable接口方式
    public static void main(String[] args) {
        CreateThreadDemo02 t2 = new CreateThreadDemo02();
        Thread thread = new Thread(t2);
        thread.start();
        for (int i = 0; i < 30; i++) {
            System.out.println("zhu,i:"+i);
        }
    }
}

class CreateThreadDemo02 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println("zi,i:"+i);
        }
    }
}
