package com.wabu.sandbox.restclient;

import com.wabu.sandbox.restclient.repository.CityRepository;
import com.wabu.sandbox.restclient.service.StationService;
import com.wabu.sandbox.restclient.startup.DbInitialPopulation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestClientApplication {

    private static final Logger log = LoggerFactory.getLogger(RestClientApplication.class);

    @Autowired
    private StationService stationService;
    @Autowired
    private DbInitialPopulation dbInitialPopulation;
    @Autowired
    private CityRepository cityRepository;

    public static void main(String[] args) {
        SpringApplication.run(RestClientApplication.class, args);
    }

    @Bean
    public CommandLineRunner run() {
        return args -> {
            if (stationService.findAllStations().isEmpty()) {
                dbInitialPopulation.insertAllStationsInfo();
            }else{
                log.info("Stations DB is not empty...");
            }
        };


    }


}
