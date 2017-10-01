package com.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.Ordered;

@Aspect
public class logControl implements Ordered {

    public logControl() {
    }

    @Pointcut("execution(* com.serviceImpl.*.*(..))")
    public void logAopController() {
    }

    @Around("logAopController()")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
          joinPoint.proceed();
    }


    @Before("logAopController()")
    public void beforeLog() {

    }


    @After("logAopController()")
    public void AfterLog() {

    }

    public int getOrder() {
        return 0;
    }
}
