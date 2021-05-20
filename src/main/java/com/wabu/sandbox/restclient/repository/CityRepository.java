package com.wabu.sandbox.restclient.repository;

import com.wabu.sandbox.restclient.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City,Integer> {

    public List<City> getCityByCommune_ProvinceName(String province);
}
