package com.tianma.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Created by Administrator on 2016/3/21.
 */

@Configuration
@ComponentScan
public class App {
    public static void main(String[] args) {
//        bossGoSomewhere();
        smartBoosGoSomewhere();
    }

    static void bossGoSomewhere() {
        Boss boss = new Boss();
        boss.goSomewhere();
    }

    static void smartBoosGoSomewhere(){
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        try {
            SmartBoss boss = context.getBean(SmartBoss.class);
            boss.goSomewhere();
        }finally {
            context.close();
        }
    }
}
