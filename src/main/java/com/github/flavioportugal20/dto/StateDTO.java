package com.github.flavioportugal20.dto;

import com.github.flavioportugal20.domain.State;
import java.util.ArrayList;
import java.util.List;

public class StateDTO {

  private Long id;
  private String name;
  private String uf;
  private Integer ibge;
  private List<Integer> ddd;

  private CountryDTO country;
  private List<CityDTO> cities = new ArrayList<>();

  public StateDTO(State state) {
    this.id = state.getId();
    this.name = state.getName();
    this.uf = state.getUf();
    this.ibge = state.getIbge();
    this.ddd = state.getDdd();
    this.country = new CountryDTO(state.getCountry());
    this.cities = (List<CityDTO>) state.getCities().stream().map(x -> new CityDTO(x));
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getUf() {
    return uf;
  }

  public Integer getIbge() {
    return ibge;
  }

  public List<Integer> getDdd() {
    return ddd;
  }

  public CountryDTO getCountry() {
    return country;
  }

  public List<CityDTO> getCities() {
    return cities;
  }

  public void setCities(List<CityDTO> cities) {
    this.cities = cities;
  }
}
