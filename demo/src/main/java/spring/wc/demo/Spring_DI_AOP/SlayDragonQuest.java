package spring.wc.demo.Spring_DI_AOP;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SlayDragonQuest implements Quest{

    @Override
    public void embark() {
        System.out.println("slay the dragon");
    }
}
