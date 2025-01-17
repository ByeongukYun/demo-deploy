package com.example.demodeploy.dto;

import lombok.Builder;
import lombok.Data;

@Data
public class DummyDto {
    private int id;
    private String msg;

    @Builder
    public DummyDto(int id, String msg) {
        this.id = id;
        this.msg = msg;
    }
}