package net.wecash.dubbo.client;

import net.wecash.dubbo.api.Student;
import net.wecash.dubbo.api.TestService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by rongjiabin on 2017/5/31.
 */
public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" });
        System.out.println("start");
        context.start();
        TestService testService = (TestService) context.getBean("testService");
        for (int i=0;i<10000;i++){
            String hello = testService.sayHello("rjb");
            System.out.println(hello);
//            Student rongjiabin = testService.getStudent("rongjiabin");
//            System.out.println(rongjiabin);
        }


//        List list = demoService.getUsers();
//        if (list != null && list.size() > 0) {
//            for (int i = 0; i < list.size(); i++) {
//                System.out.println(list.get(i));
//            }
//        }

//        try {
//            System.in.read();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
