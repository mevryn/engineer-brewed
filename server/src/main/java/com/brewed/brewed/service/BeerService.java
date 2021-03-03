package com.brewed.brewed.service;

import com.brewed.brewed.model.Beer;
import com.brewed.brewed.repository.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class BeerService {

    private final BeerRepository beerRepository;

    @Autowired
    public BeerService(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    public Collection<Beer> getAllBeers() {
        List<Beer> listOfBeers = beerRepository.findAll();
        for (Beer beer : listOfBeers) {
            beer.setPrice(calculatePriceWithVat(beer.getPrice(), 0.23f));
        }
        return listOfBeers;
    }

    private float calculatePriceWithVat(float price, float vat) {
        return price * (1 + vat);
    }
}
