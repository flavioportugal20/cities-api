package com.github.flavioportugal20.services;

import com.github.flavioportugal20.domain.State;
import com.github.flavioportugal20.dto.StateDTO;
import com.github.flavioportugal20.repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StateService {

    @Autowired
    private StateRepository repository;

    @Transactional(readOnly = true)
    public Page<StateDTO> findAll(Pageable pageable){
        Page<State> result = repository.findAll(pageable);
        return result.map(x -> new StateDTO(x));
    }

}

