package com.puzzle.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Exam {
    private int puzzleId;

    private String name;

    private Set<Integer> missingItems;
}
