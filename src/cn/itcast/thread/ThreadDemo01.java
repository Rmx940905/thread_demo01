package cn.itcast.thread;

public class ThreadDemo01 {
    /*
     *创建线程的4中方式？
     * 1、使用继承Thread类方式
     * 2、使用实现runable接口方式
     * 3、使用匿名内部类方式
     * 4、callable
     * 5、使用线程池创建线程
     */
    public static void main(String[] args) {
        threadDemo01();

    }

    //使用继承Thread类方式
    private static void threadDemo01() {
        //如何调用线程
        CreateThreadDemo01 t1 = new CreateThreadDemo01();
        //启动线程 不是调用run方法，而是调用start方法
        t1.start();
        for (int i = 0; i < 30; i++) {
            System.out.println("main,i:"+i);
        }
    }

}

class CreateThreadDemo01 extends Thread{

    public void run(){
        for (int i = 0; i < 30; i++) {
            System.out.println("run,i:"+i);
        }
    }
}

