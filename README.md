# spring-batch-validate-reader

This project is created to answer a question on StackOverflow
https://stackoverflow.com/questions/58249060/validate-field-length-while-reading-csv-file-in-spring-batch

I override the FlatItemReader and then perform Bean Validation using Hibernate Validator. 

If there is any validation failed, currently the example will fail the job itself.

Let me know if you need more information. I hope the code itself explains.
