package spring.wc.demo.Spring_DI_AOP;

import com.jayway.jsonpath.internal.function.numeric.Min;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import spring.wc.demo.AOP.Audience;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class AOPConfig {

    @Bean
    public Minstrel minstrel() {
        return new Minstrel();
    }
}
