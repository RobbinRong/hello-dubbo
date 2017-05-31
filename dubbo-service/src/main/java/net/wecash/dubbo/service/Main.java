package net.wecash.dubbo.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by rongjiabin on 2017/5/31.
 */
public class Main {
    public static void main(String[] args) {
//        for (int i=0;i<10;i++){
//            new Thread(new Runnable() {
//                public void run() {
                    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                            new String[] { "applicationContext.xml" });
                    context.start();
                    try {
                        System.in.read();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
//                }
//            }).start();
//        }

    }
}
