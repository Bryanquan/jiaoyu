package com.annotation;

import java.lang.annotation.*;

@Documented
@Target(value = {ElementType.FIELD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Length {
    int maxLength() default 20;

    int minLength() default 0;
}
