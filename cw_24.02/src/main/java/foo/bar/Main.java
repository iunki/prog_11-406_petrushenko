package foo.bar;

import foo.bar.concert.Concert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Concert concert = (Concert) context.getBean("concert");
        concert.start();
    }
}
