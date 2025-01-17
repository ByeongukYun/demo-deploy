package com.example.demodeploy.controller;

import com.example.demodeploy.dto.DummyDto;
import com.example.demodeploy.service.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DummyController {
    @Autowired
    private DummyService dummyService;

    @GetMapping("/dummy")
    public List<DummyDto> dummy() {
        return dummyService.getAllDummy();
    }
}
