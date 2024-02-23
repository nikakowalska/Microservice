package com.nikakowalska.microservice.controller;
import com.nikakowalska.microservice.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/winner")
public class ScoreController {
    @Autowired
    private ScoreService scoreService;

    @PostMapping("/playerData")
    public boolean postUser(
            @PathVariable String playerData
    ) {
        return scoreService.createUser(playerData);
    }

    @GetMapping("/result")
    public String getGameResult(@RequestParam String result) {
        return scoreService.getResult();
    }
}
