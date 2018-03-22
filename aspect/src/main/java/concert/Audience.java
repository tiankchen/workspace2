package concert;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
    @Pointcut("execution(* concert.Performance.perform(..))")
    public void performance() {
    }

    @Before("performance()")
    public void silenceCellPhones(){
        System.out.println("Silencing cell phones");
    }

    @After("performance()")
    public void applause(){
        System.out.println("Clap! Clap! Clap!");
    }
}

