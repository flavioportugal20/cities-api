package com.github.flavioportugal20.repositories;

import com.github.flavioportugal20.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
