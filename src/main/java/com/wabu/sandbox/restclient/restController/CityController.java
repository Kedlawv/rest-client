package com.wabu.sandbox.restclient.restController;

import com.wabu.sandbox.restclient.domain.City;
import com.wabu.sandbox.restclient.service.CityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CityService cityService;

    @GetMapping("/v1/cities/findAll")
    public List<City> getAllCities(){
        return cityService.findAll();
    }

    @GetMapping("/v1/cities/{province}")
    public List<City> getCitiesForProvince(@PathVariable String province){
        return cityService.findCitiesInProvince(province);
    }

}
