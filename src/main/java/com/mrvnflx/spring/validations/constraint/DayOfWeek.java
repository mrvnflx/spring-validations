package com.mrvnflx.spring.validations.constraint;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by mrvnf on 2/27/2017.
 */
@Documented
@Constraint(validatedBy = DayOfWeekValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface DayOfWeek {
    String message() default "error.dayofweek.constraint";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
    DayOfWeekType[] value() default {};
    boolean ignoreCase() default false;
}
