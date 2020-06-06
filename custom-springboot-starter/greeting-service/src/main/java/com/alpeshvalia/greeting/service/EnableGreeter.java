package com.alpeshvalia.greeting.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(value = {GreetingAutoConfiguration.class})
@ConditionalOnBean(Greeter.class)
public @interface EnableGreeter {
}
