package com.example.demodeploy.service;

import com.example.demodeploy.dto.DummyDto;
import com.example.demodeploy.entity.Dummy;
import com.example.demodeploy.repository.DummyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DummyService {
    @Autowired
    private DummyRepository dummyRepository;

    public List<DummyDto> getAllDummy() {
        List<Dummy> dummies = dummyRepository.findAll();
        List<DummyDto> dummyDtos = new ArrayList<>();

        for (Dummy dummy : dummies) {
            dummyDtos.add(DummyDto.builder()
                    .id(dummy.getId())
                    .msg(dummy.getMsg())
                    .build() );
        }
        return dummyDtos;
    }
}