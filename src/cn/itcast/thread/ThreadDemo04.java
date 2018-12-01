package cn.itcast.thread;

public class ThreadDemo04 {
    public static void main(String[] args) {
        //获取主线程Id  Thread.currentThread()获取当前线程
        System.out.println("主线程:" + Thread.currentThread().getId());
        for (int i = 0; i <2 ; i++) {
            CreateThreadDemo04 t4 = new CreateThreadDemo04();
            t4.start();
        }
    }
}

class CreateThreadDemo04 extends Thread{
    //getId()线程的id   getName()获取线程的名字  sleep()休眠  wait()等待  stop()结束当前线程
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getId()+"子线程,i:" + i);

            if(i==5){
                stop();//不建议使用,不安全;
            }
        }
    }
}
