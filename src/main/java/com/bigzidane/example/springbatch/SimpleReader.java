package com.bigzidane.example.springbatch;

import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.FlatFileParseException;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Objects;
import java.util.Set;

public class SimpleReader extends FlatFileItemReader<SoccerTeam> {
    private Validator factory = Validation.buildDefaultValidatorFactory().getValidator();

    @Override
    public SoccerTeam doRead() throws Exception {
        SoccerTeam soccerTeam = super.doRead();

        if (Objects.isNull(soccerTeam)) return null;

        Set<ConstraintViolation<SoccerTeam>> violations = this.factory.validate(soccerTeam);
        if (!violations.isEmpty()) {
            System.out.println(violations);
            String errorMsg = String.format("The input has validation failed. Data is '%s'", soccerTeam);
            throw new FlatFileParseException(errorMsg, Objects.toString(soccerTeam));
        }
        else {
            return soccerTeam;
        }
    }
}
