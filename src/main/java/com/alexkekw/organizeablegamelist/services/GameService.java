package com.alexkekw.organizeablegamelist.services;

import com.alexkekw.organizeablegamelist.DTO.GameMinDTO;
import com.alexkekw.organizeablegamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        return gameRepository.findAll().stream().map(GameMinDTO::new).toList();
    }

}
