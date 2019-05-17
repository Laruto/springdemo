package spring.wc.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import spring.wc.demo.Spring_DI_AOP.BraveKnight;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    BraveKnight braveKnight;

    @Test
    public void contextLoads() {
        braveKnight.embarkOnQuest();
    }

}
