package com.bigzidane.example.springbatch;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class SoccerTeam {

    @Size(max = 60)
    private String name;
    private String national;

    @Min(value = 1)
    @Max(value = 100)
    private int rank;

    public void setName(String name) {
        this.name = name;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "SoccerTeam{" +
                "name='" + name + '\'' +
                ", national='" + national + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
