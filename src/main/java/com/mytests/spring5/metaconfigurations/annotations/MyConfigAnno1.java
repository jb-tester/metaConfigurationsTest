package com.mytests.spring5.metaconfigurations.annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/3/2017.
 * Project: untitled
 * *******************************
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration
@ComponentScan
public @interface MyConfigAnno1 {
    @AliasFor(annotation = ComponentScan.class, attribute = "basePackages")
    String[] packages();
}
