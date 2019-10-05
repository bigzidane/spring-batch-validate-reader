package com.bigzidane.example.springbatch;

import org.springframework.batch.item.ItemWriter;

import java.util.List;

public class SimpleWriter implements ItemWriter<SoccerTeam> {
    @Override
    public void write(List<? extends SoccerTeam> list) throws Exception {
        list.stream().forEach(s -> System.out.println(s));
    }
}
