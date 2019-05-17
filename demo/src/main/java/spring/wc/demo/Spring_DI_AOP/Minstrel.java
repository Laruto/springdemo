package spring.wc.demo.Spring_DI_AOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 骑士探险前加强，探险后鼓舞
 */
@Aspect
public class Minstrel {

    @Pointcut("execution(* spring.wc.demo.Spring_DI_AOP.BraveKnight.embarkOnQuest(..))")
    public void knight() {}

    @Before("knight()")
    public void singBeforeQuest() {
        System.out.println("sing a song to strengthen knights");
    }

    @After("knight()")
    public void singAfterQuest() {
        System.out.println("sing a song to inspire knights");
    }
}
