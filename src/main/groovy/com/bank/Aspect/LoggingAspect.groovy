package com.bank.Aspect

import com.bank.GroovaaApplication
import com.bank.service.BankService
import org.aspectj.lang.JoinPoint
import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.aspectj.lang.annotation.Pointcut
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

/**
 * Created by aisma on 11.05.2016.
 */
@Component
@Aspect
class LoggingAspect {
    private static final Logger log = LoggerFactory.getLogger(GroovaaApplication.class);
    //org.softw_sys_dev.sample.ninth.
    @Pointcut("execution(* com.bank.*.*Service.read*(..)) ")
    public void read() {
    }

    @Pointcut("execution(* com.bank.*.*Service.create*(..)) ")
    public void create() {
    }

    //    @Before("execution(public String getEmployee())")
    @Before("read()")
    public void getEmployeeAdvice() {
        log.info("==> Executing Advice on read()")

        }


    @Before("create()")
    public void getAllAdvice(JoinPoint joinpoint) {
        log.info("==> Service method setter create")
        log.warn(joinpoint.toString())
        if(joinpoint.getTarget().metaClass.toString()=~/Service/){
            log.info("nextLineContext")
            log.info(joinpoint.getTarget().toString())
        }else{
            log.error("is no Context class")
            log.info(joinpoint.getTarget().toString())
        }


    }

    // --------------------------------------
    @Pointcut("within(org.softw_sys_dev.sample.ninth.*)")
    public void allMethodsPointcut() {
    }

    //Pointcut to execute on all the methods of classes in a package
    @Before("allMethodsPointcut()")
    public void pointcutForAll(JoinPoint joinPoint) {
        log.info(">>> each methods are adviced");
        log.info(">>> Before running loggingAdvice on method=" + joinPoint.toString());
        log.info(">>> Arguments Passed=" + Arrays.toString(joinPoint.getArgs()));
    }

    @Around("execution(* org.softw_sys_dev.sample.ninth.*.c*(..)) ")
    public Object createEmployeeAdvice(ProceedingJoinPoint proceedingJoinPoint) {
        log.info("=====> Start invoking on create*()");
        Object value = null;
        try {
            value = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        log.info("=====> After invoking create*() method. Return value=" + value);
        return value;
    }

}
