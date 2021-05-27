package com.github.flavioportugal20.services;

import com.github.flavioportugal20.domain.Country;
import com.github.flavioportugal20.dto.CountryDTO;
import com.github.flavioportugal20.repositories.CountryRepository;
import com.github.flavioportugal20.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository repository;

    @Transactional(readOnly = true)
    public CountryDTO find(Long id) {
        Optional<Country> obj = repository.findById(id);
        return new CountryDTO(obj.orElseThrow(() -> new ObjectNotFoundException("País não encontrado!")));
    }

    @Transactional(readOnly = true)
    public Page<CountryDTO> findAll(Pageable pageable){
        Page<Country> result = repository.findAll(pageable);
        return result.map(x -> new CountryDTO(x));
    }

}

