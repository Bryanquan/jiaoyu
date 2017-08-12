package com.annotation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE})
public @interface Optional {
    String[] value() default "";
}
