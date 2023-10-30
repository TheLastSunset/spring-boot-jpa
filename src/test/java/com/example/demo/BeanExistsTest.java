package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.orm.jpa.support.OpenEntityManagerInViewInterceptor;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(properties = {
        "spring.jpa.open-in-view=true"
})
public class BeanExistsTest extends SpringBootJpaApplicationBaseCase {

    @Test
    void contextLoads() {
        OpenEntityManagerInViewInterceptor bean = applicationContext.getBean(OpenEntityManagerInViewInterceptor.class);
        assertThat(bean).isNotNull();
    }

}
