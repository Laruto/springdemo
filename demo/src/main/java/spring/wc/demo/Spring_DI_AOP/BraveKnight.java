package spring.wc.demo.Spring_DI_AOP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.Queue;

@Configuration
public class BraveKnight implements Knight {

    private Quest quest;

    @Autowired
    public BraveKnight(SlayDragonQuest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
