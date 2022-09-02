package org.genspark;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ComponentScan(basePackages = "org.genspark")
public class JavaConfig {
    @Bean
    public Phone phone1() {
        return new Phone("626 228 1111");
    }

    @Bean
    public Phone phone2() {
        return new Phone("626 228 2222");
    }

    @Bean
    public Phone phone3() {
        return new Phone("626 228 2222");
    }

    public Student student(List list){
        list.add(phone1());
        list.add(phone2());
        list.add(phone3());
        return (Student) list;
    }
}


