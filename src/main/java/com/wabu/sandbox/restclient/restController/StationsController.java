package com.wabu.sandbox.restclient.restController;

import com.wabu.sandbox.restclient.domain.Station;
import com.wabu.sandbox.restclient.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StationsController {

    @Autowired
    private StationService stationService;

    @GetMapping("/v1/stations/findAll")
    public List<Station> getAllStations(){
        return stationService.findAllStations();
    }

    @GetMapping("/v1/stations/{city}")
    public List<Station> getStationsForCity(@PathVariable String city){
        return stationService.getStationsForCity(city);
    }


}
