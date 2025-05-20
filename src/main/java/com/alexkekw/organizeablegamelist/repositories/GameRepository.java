package com.alexkekw.organizeablegamelist.repositories;

import com.alexkekw.organizeablegamelist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {}
