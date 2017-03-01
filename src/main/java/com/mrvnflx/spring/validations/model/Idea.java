package com.mrvnflx.spring.validations.model;

import com.mrvnflx.spring.validations.constraint.DayOfWeek;
import com.mrvnflx.spring.validations.constraint.DayOfWeekType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by mrvnf on 2/27/2017.
 */
@Entity
@Table
@Getter@Setter
public class Idea {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    @NotNull(message = "error.title.notnull")
    @Size(min = 1, max = 30, message = "error.title.size")
    private String title;

    @Column
    @DayOfWeek(value = DayOfWeekType.WEEKEND, ignoreCase = true)
    private String dayOfWeek;

    @Column
    @Size(max = 100, message = "error.description.size")
    private String description;

    @Column
    private Date createdAt;


}
