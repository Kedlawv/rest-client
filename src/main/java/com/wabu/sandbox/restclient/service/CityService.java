package com.wabu.sandbox.restclient.service;

import com.wabu.sandbox.restclient.domain.City;
import com.wabu.sandbox.restclient.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public List<City> findCitiesInProvince(String province){
        return cityRepository.getCityByCommune_ProvinceName(province.toUpperCase());
    }

    public List<City> findAll(){
        return cityRepository.findAll();
    }
}
