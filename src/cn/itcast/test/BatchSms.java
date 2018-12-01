package cn.itcast.test;

import cn.itcast.entity.User;
import cn.itcast.utils.ListUtils;

import java.util.ArrayList;
import java.util.List;

/*
 * 使用多线程分批发送
 */

public class BatchSms {

    public static void main(String[] args) {
        //1、初始化数据
        List<User> initUser = initUser();
        //2、定义每个线程分批发送大小
        int userCount = 2;
        //3、计算每个线程许哟啊分批跑的数据
        List<List<User>> splitList = ListUtils.splitList(initUser(), userCount);
        for (int i = 0; i < splitList.size(); i++) {
            List<User> list =  splitList.get(i);
            UserSendThread userSendThread = new UserSendThread(list);
            //4、进行分批进行发送
            Thread thread = new Thread(userSendThread,"线程"+i);
            thread.start();
            System.out.println();
        }

    }

    private static List<User> initUser(){
        List<User> list = new ArrayList<User>();
        for (int i = 0; i < 10; i++) {
            list.add(new  User("UserId:"+ i,"UserName:"+ i));
        }
        return list;
    }
}

class UserSendThread implements Runnable {

    private List<User> listUser;

    public UserSendThread(List<User> listUser) {
        this.listUser = listUser;
    }

    @Override
    public void run() {
        for(User user : listUser){
            System.out.println(Thread.currentThread().getName()+","+user.toString());
        }
    }
}