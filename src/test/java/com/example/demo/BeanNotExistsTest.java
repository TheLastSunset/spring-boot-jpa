package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.orm.jpa.support.OpenEntityManagerInViewInterceptor;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

@SpringBootTest(properties = {
        "spring.jpa.open-in-view=false"
})
class BeanNotExistsTest extends SpringBootJpaApplicationBaseCase {

    @Test
    void contextLoads() {
        assertThatThrownBy(() -> applicationContext.getBean(OpenEntityManagerInViewInterceptor.class))
                .isInstanceOf(NoSuchBeanDefinitionException.class);
    }

}
