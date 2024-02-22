package core.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
@Component
public class LogAspect {
    
    @Pointcut("target(core.service.HelloService)")
    public void helloServiceMethod() {

    }
    
    @Before("helloServiceMethod()")
    public void beforeHelloServiceMethod(JoinPoint joinPoint) {
        String nameClass = joinPoint.getTarget().getClass().getName();
        String nameMethod = joinPoint.getSignature().getName();

        log.info("Before " + nameClass + "." + nameMethod + "()");
    }
}
