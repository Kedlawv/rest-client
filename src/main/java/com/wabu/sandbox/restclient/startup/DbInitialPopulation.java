package com.wabu.sandbox.restclient.startup;

import com.wabu.sandbox.restclient.restClient.StationInfoGrabber;
import com.wabu.sandbox.restclient.domain.Station;
import com.wabu.sandbox.restclient.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DbInitialPopulation {


    @Autowired
    private StationInfoGrabber stationInfoGrabber;
    @Autowired
    private StationService stationService;

    public void insertAllStationsInfo(){

        List<Station> stations = stationInfoGrabber.getAllStations();
        stationService.saveAllStations(stations);
    }
}
