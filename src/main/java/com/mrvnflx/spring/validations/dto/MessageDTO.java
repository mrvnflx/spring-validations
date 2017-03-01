package com.mrvnflx.spring.validations.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by mrvnf on 2/27/2017.
 */
@AllArgsConstructor
@Getter@Setter
public class MessageDTO {

    private String message;
    private MessageType type;
}
