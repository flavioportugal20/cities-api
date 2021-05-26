package com.github.flavioportugal20.dto;

import com.github.flavioportugal20.domain.Country;
import java.util.ArrayList;
import java.util.List;

public class CountryDTO {

  private Long id;
  private String name;
  private String portugueseName;
  private String code;
  private Integer bacen;

  private List<StateDTO> states = new ArrayList<>();

  public CountryDTO() {
  }

  public CountryDTO(Country country) {
    this.id = country.getId();
    this.name = country.getName();
    this.portugueseName = country.getPortugueseName();
    this.code = country.getCode();
    this.bacen = country.getBacen();
    this.states = (List<StateDTO>) country.getStates().stream().map(x -> new StateDTO(x));
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getPortugueseName() {
    return portugueseName;
  }

  public String getCode() {
    return code;
  }

  public Integer getBacen() {
    return bacen;
  }

  public List<StateDTO> getStates() {
    return states;
  }

  public void setStates(List<StateDTO> states) {
    this.states = states;
  }
}
