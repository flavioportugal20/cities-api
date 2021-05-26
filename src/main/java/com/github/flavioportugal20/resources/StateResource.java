package com.github.flavioportugal20.resources;

import com.github.flavioportugal20.dto.StateDTO;
import com.github.flavioportugal20.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/staties")
public class StateResource {

  @Autowired
  private StateService service;

  @GetMapping
  public ResponseEntity<Page<StateDTO>> findAll(Pageable pageable) {
    Page<StateDTO> list = service.findAll(pageable);
    return ResponseEntity.ok(list);
  }
}
