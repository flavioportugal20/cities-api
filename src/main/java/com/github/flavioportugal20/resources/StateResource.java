package com.github.flavioportugal20.resources;

import com.github.flavioportugal20.dto.StateDTO;
import com.github.flavioportugal20.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/staties")
public class StateResource {

  @Autowired
  private StateService service;

  @GetMapping("/{id}")
  public ResponseEntity<StateDTO> find(@PathVariable Long id) {
    StateDTO obj = service.find(id);
    return ResponseEntity.ok().body(obj);
  }

  @GetMapping
  public ResponseEntity<Page<StateDTO>> findAll(Pageable pageable) {
    Page<StateDTO> list = service.findAll(pageable);
    return ResponseEntity.ok(list);
  }
}
