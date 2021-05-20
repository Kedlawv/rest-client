package com.wabu.sandbox.restclient.restClient;

import com.wabu.sandbox.restclient.domain.SensorInfo;
import com.wabu.sandbox.restclient.domain.Station;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.*;

@Component
public class StationInfoGrabber {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private final RestTemplate restTemplate = new RestTemplate();

    public List<Station> getAllStations() {
        log.info("Fetching Station info from remote server");
        ResponseEntity<Station[]> response = restTemplate
                .getForEntity("http://api.gios.gov.pl/pjp-api/rest/station/findAll"
                        , Station[].class);
        Station[] allStations = response.getBody();
        return Arrays.asList(allStations.clone());
    }

    public List<SensorInfo> getSensorsInfoForStation(int stationId) {

        String url = "http://api.gios.gov.pl/pjp-api/rest/station/sensors/{stationId}";

        String stationIdParam = String.valueOf(stationId);
        Map<String, String> params = new HashMap<>();
        params.put("stationId", stationIdParam);
        URI uri = UriComponentsBuilder.fromUriString(url).buildAndExpand(params).toUri();

        log.info(uri.toString());

        SensorInfo[] data = restTemplate.getForObject(uri, SensorInfo[].class);

        return Arrays.asList(data);
    }
}
