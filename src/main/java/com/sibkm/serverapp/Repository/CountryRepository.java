package com.sibkm.serverapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sibkm.serverapp.Entity.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
