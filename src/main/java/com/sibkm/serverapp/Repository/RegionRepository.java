package com.sibkm.serverapp.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sibkm.serverapp.Entity.Region;
@Repository
public interface RegionRepository extends JpaRepository<Region, Integer> {
    Optional<Region> findByNameLike(String name);
}