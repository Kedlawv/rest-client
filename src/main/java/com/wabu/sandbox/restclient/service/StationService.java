package com.wabu.sandbox.restclient.service;

import com.wabu.sandbox.restclient.domain.City;
import com.wabu.sandbox.restclient.domain.Commune;
import com.wabu.sandbox.restclient.domain.Station;
import com.wabu.sandbox.restclient.repository.CityRepository;
import com.wabu.sandbox.restclient.repository.CommuneRepository;
import com.wabu.sandbox.restclient.repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StationService {

    @Autowired
    private StationRepository stationRepository;
    @Autowired
    private CityRepository cityRepository;
    @Autowired
    private CommuneRepository communeRepository;

    public void saveStation(Station station){
        Commune commune = station.getCity().getCommune();
        City city = station.getCity();
        if(communeRepository.getByCommuneName(commune.getCommuneName()) == null){
            communeRepository.save(commune);
        }else{
            commune = communeRepository.getByCommuneName(commune.getCommuneName());
        }

        city.setCommune(commune);
        cityRepository.save(city);
        stationRepository.save(station);
    }

    public void saveAllStations(List<Station> stations){
        for(Station station : stations){
            saveStation(station);
        }
    }

    public List<Station> findAllStations(){
        return stationRepository.findAll();
    }

    public List<Station> getStationsForCity(String city) {
        return stationRepository.findAllByCityName(city);
    }
}
