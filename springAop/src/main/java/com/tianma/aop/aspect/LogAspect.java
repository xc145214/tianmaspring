package com.tianma.aop.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/3/21.
 */

@Aspect
@Component
public class LogAspect {

    @Pointcut("execution(* com.tianma.aop..*.bookFlight(..))")
    private void logPointCut(){}

    @AfterReturning(pointcut = "logPointCut()",returning = "retVal")
    public void logBookingStatus(boolean retVal){
        if (retVal) {
            System.out.println("booking flight succeeded!");
        } else {
            System.out.println("booking flight failed!");
        }
    }
}
