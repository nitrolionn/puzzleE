package com.puzzle.controller.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.puzzle.controller.serializer.DateSerializer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlayerDto {
    private int id;

    private String name;

    @JsonSerialize(using = DateSerializer.class)
    private Date birthDate;
}
