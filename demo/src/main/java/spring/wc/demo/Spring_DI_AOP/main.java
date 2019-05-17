package spring.wc.demo.Spring_DI_AOP;

import lombok.ToString;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class main {

    @Autowired
    private BraveKnight braveKnight;

    @Test
    public void test() {
        braveKnight.embarkOnQuest();
    }
}
