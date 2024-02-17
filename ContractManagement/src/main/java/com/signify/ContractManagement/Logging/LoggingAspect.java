package com.signify.ContractManagement.Logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.signify.ContractManagement.Controller.*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        // Log method entry
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Entering method: " + methodName);
    }

    @AfterReturning(pointcut = "execution(* com.signify.ContractManagement.Controller.*.*(..))", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        // Log method exit
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Exiting method: " + methodName);
    }
}

