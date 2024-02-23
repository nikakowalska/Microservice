package com.nikakowalska.microservice.service;

import com.nikakowalska.microservice.buider.PlayerBuilder;
import com.nikakowalska.microservice.dto.PlayerDto;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ScoreService {
    private static final String PLAYER_DATA_SEPARATOR = ":";
    private List<PlayerDto> players = new ArrayList<>();


    public boolean createUser(String id, String scoreValue) {
        players.add(
                PlayerBuilder.builder().withId(id).withScoreValue(scoreValue).build()
        );
        return true;
    }

}
