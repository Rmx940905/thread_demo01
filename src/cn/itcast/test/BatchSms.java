package cn.itcast.test;

import cn.itcast.entity.User;
import java.util.ArrayList;
import java.util.List;

public class BatchSms {

    public static void main(String[] args) {
        //1、初始化数据
        List<User> list = initUser();
        //2、定义每个线程分批发送大小
        int userCount = 2;
        //3、计算每个线程许哟啊分批跑的数据
        //4、进行分批进行发送
    }

    private static List<User> initUser(){
        List<User> list = new ArrayList<User>();
        for (int i = 0; i < 10; i++) {
            list.add(new  User("UserId:"+ i,"UserName"+ i));
        }
        return list;
    }
}
