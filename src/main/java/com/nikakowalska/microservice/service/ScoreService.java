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

    public boolean createUser(String playerData) {
        String[] idplusScore = playerData.split(PLAYER_DATA_SEPARATOR);
        players.add(
                PlayerBuilder.builder().
                        withId(idplusScore[0]).
                        withScoreValue(idplusScore[1]).
                        build()
        );
        return true;
    }

    public String getResult() {
        int p1score = Integer.parseInt(players.get(0).getScoreValue());
        int p2score = Integer.parseInt(players.get(1).getScoreValue());

        if (p1score > p2score) {
            return "Congratulations Player1";
        } else if (p1score < p2score) {
            return "Congratulations Player2";
        } else {
            return "It's a draw";
        }
    }
}