package com.mytests.spring5.metaconfigurations.configs;

import com.mytests.spring5.metaconfigurations.annotations.MyConfigAnno1;
import com.mytests.spring5.metaconfigurations.beans.B0;
import com.mytests.spring5.metaconfigurations.beans.B1;
import com.mytests.spring5.metaconfigurations.beans.B2;
import com.mytests.spring5.metaconfigurations.beans.B3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/3/2017.
 * Project: untitled
 * *******************************
 */
@Configuration
//@MyConfigAnno1(packages = "com.mytests.spring5.metaconfigurations.components0")
public class Config1 {
    @Bean
    public B0 b0() {
        return new B0();
    }

    @MyConfigAnno1(packages = "com.mytests.spring5.metaconfigurations.components1")
    //@Configuration
    //@ComponentScan("com.mytests.spring5.metaconfigurations.components1")
    public static class InnerConfig1{

        @Bean
        public B1 b1() {
            return new B1("b1");
        }
    }
    @MyConfigAnno1(packages = "com.mytests.spring5.metaconfigurations.components2")
    //@Configuration
    //   @ComponentScan("com.mytests.spring5.metaconfigurations.components2")
    public static class InnerConfig2{
        @Bean
        public B2 b2() {
            return new B2("b2");
        }

        @MyConfigAnno1(packages = "com.mytests.spring5.metaconfigurations.components3")
        public static class InnerConfig3{
            @Bean
            public B3 b3() {
                return new B3("b3");
            }
        }
    }
}
