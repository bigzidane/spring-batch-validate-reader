package com.bigzidane.example.springbatch;

import org.springframework.batch.core.ItemReadListener;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

public class SimpleReaderListener implements ItemReadListener<SoccerTeam> {
    private Validator factory = Validation.buildDefaultValidatorFactory().getValidator();

    @Override
    public void afterRead(SoccerTeam soccerTeam) {
        Set<ConstraintViolation<SoccerTeam>> violations = this.factory.validate(soccerTeam);
        violations.stream().forEach(v -> System.out.println(v));
    }

    @Override
    public void beforeRead() {

    }

    @Override
    public void onReadError(Exception e) {

    }
}
