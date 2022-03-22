package com.puzzle.model.repository;

import com.puzzle.model.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Integer> {
}
