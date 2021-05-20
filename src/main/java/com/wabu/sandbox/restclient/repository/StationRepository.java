package com.wabu.sandbox.restclient.repository;

import com.wabu.sandbox.restclient.domain.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StationRepository extends JpaRepository<Station,Long> {
    public List<Station> findAllByCityName(String city);
}
