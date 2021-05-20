package com.wabu.sandbox.restclient.repository;

import com.wabu.sandbox.restclient.domain.Commune;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommuneRepository extends JpaRepository<Commune,Long> {

    public Commune getByCommuneName(String name);
}
