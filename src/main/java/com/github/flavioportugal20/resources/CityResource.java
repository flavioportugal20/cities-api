package com.github.flavioportugal20.resources;

import com.github.flavioportugal20.dto.CityDTO;
import com.github.flavioportugal20.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cities")
public class CityResource {

  @Autowired
  private CityService service;

  @GetMapping("/{id}")
  public ResponseEntity<CityDTO> find(@PathVariable Long id) {
    CityDTO obj = service.find(id);
    return ResponseEntity.ok().body(obj);
  }

  @GetMapping
  public ResponseEntity<Page<CityDTO>> findAll(Pageable pageable) {
    Page<CityDTO> list = service.findAll(pageable);
    return ResponseEntity.ok(list);
  }

}
