package com.nikakowalska.microservice.dto;

import java.util.Objects;

public class PlayerDto {
    private String id;
    private String scoreValue;

    public PlayerDto(final String id, final String scoreValue) {
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getScoreValue() {
        return scoreValue;
    }

    public void setScoreValue(final String scoreValue) {
        this.scoreValue = scoreValue;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final PlayerDto playerDto = (PlayerDto) o;

        if (!Objects.equals(id, playerDto.id)) return false;
        return Objects.equals(scoreValue, playerDto.scoreValue);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (scoreValue != null ? scoreValue.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PlayerDto{" +
                "id='" + id + '\'' +
                ", scoreValue='" + scoreValue + '\'' +
                '}';
    }
}
