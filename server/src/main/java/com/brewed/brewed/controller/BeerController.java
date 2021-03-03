package com.brewed.brewed.controller;

import com.brewed.brewed.model.Beer;
import com.brewed.brewed.service.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class BeerController {


    @Autowired
    private BeerService beerService;

    @GetMapping
    public Collection<Beer> getBeers() {
        return beerService.getAllBeers();
    }
}
