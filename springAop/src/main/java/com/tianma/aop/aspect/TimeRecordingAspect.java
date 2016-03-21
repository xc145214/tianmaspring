package com.tianma.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/3/21.
 */
@Aspect
@Component
public class TimeRecordingAspect {

    @Pointcut("execution(* com.tianma.aop..*.bookFlight(..))")
    private void timeRecordingPointCut() {
    }

    @Around("timeRecordingPointCut()")
    public Object recordTime(ProceedingJoinPoint pjp) throws Throwable {  //2

        long start = System.currentTimeMillis();
        Object retVal = pjp.proceed(); // 3

        long duration = System.currentTimeMillis() - start;
        System.out.println(String.format(
                "time for booking flight is %d seconds", duration));

        return retVal;
    }
}
