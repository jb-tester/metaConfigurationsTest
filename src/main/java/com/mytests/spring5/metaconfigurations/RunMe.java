package com.mytests.spring5.metaconfigurations;

import com.mytests.spring5.metaconfigurations.beans.B0;
import com.mytests.spring5.metaconfigurations.configs.Config1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/3/2017.
 * Project: untitled
 * *******************************
 */
public class RunMe {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config1.class);
        B0 b0 = (B0) ctx.getBean("b0");
        b0.display();
    }

}