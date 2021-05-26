package com.github.flavioportugal20.services;

import com.github.flavioportugal20.domain.City;
import com.github.flavioportugal20.dto.CityDTO;
import com.github.flavioportugal20.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CityService {

    @Autowired
    private CityRepository repository;

    @Transactional(readOnly = true)
    public Page<CityDTO> findAll(Pageable pageable){
        Page<City> result = repository.findAll(pageable);
        return result.map(x -> new CityDTO(x));
    }

}

