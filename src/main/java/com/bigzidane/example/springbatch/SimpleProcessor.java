package com.bigzidane.example.springbatch;

import org.springframework.batch.item.ItemProcessor;

public class SimpleProcessor implements ItemProcessor<SoccerTeam, SoccerTeam> {

    @Override
    public SoccerTeam process(SoccerTeam soccerTeam) {
        return soccerTeam;
    }
}
