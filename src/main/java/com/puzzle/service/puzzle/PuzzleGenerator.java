package com.puzzle.service.puzzle;

import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Component
public class PuzzleGenerator {

    public Set<Integer> generate(int numOfItems) {
        Set<Integer> numbers = new HashSet<>();
        Random randomGenerator = new Random();
        while (numbers.size() < numOfItems) {
            int random = randomGenerator.nextInt(numOfItems);
            numbers.add(random);
        }

        return numbers;
    }
}
