package com.nikakowalska.microservice.buider;

import com.nikakowalska.microservice.dto.PlayerDto;

import java.util.Objects;

public class PlayerBuilder {
    private String id;
    private String scoreValue;


    public static PlayerBuilder builder() {
        return new PlayerBuilder();
    }

    public PlayerDto build() {
        return new PlayerDto(this.id, this.scoreValue);
    }

    public PlayerBuilder withId(String id) {
        this.id = id;
        return this;
    }

    public PlayerBuilder withScoreValue(String scoreValue) {
        this.scoreValue = scoreValue;
        return this;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final PlayerBuilder that = (PlayerBuilder) o;

        if (!Objects.equals(id, that.id)) return false;
        return Objects.equals(scoreValue, that.scoreValue);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (scoreValue != null ? scoreValue.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PlayerBuilder{" +
                "id='" + id + '\'' +
                ", scoreValue='" + scoreValue + '\'' +
                '}';
    }
}