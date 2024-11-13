package com.xmen.mutante.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.xmen.mutante.model.Stats;
import com.xmen.mutante.service.StatsService;

public class StatsController {

    @Autowired
    private StatsService statsService;

    @GetMapping("/stats")
    public ResponseEntity<Stats> getStats() {
        return ResponseEntity.ok(statsService.calculateStats());
    }




}
