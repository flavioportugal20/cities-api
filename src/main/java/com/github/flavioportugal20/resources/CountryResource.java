package com.github.flavioportugal20.resources;

import com.github.flavioportugal20.dto.CountryDTO;
import com.github.flavioportugal20.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryResource {

  @Autowired
  private CountryService service;

  @GetMapping("/{id}")
  public ResponseEntity<CountryDTO> find(@PathVariable Long id) {
    CountryDTO obj = service.find(id);
    return ResponseEntity.ok().body(obj);
  }

  @GetMapping
  public ResponseEntity<Page<CountryDTO>> findAll(Pageable pageable) {
    Page<CountryDTO> list = service.findAll(pageable);
    return ResponseEntity.ok(list);
  }

}
