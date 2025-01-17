package com.example.demodeploy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Dummy {
    @Id
    private int id;
    private String msg;

}
