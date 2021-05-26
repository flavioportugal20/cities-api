package com.github.flavioportugal20.dto;

import com.github.flavioportugal20.domain.City;
import com.github.flavioportugal20.domain.State;


public class CityDTO {

  private Long id;
  private String name;
  private Integer uf;
  private Integer ibge;
  private String geolocation;
  private PointDTO location;
  private State state;


  public CityDTO(final Long id, final String name, final Integer uf, final Integer ibge,
                 final String geolocation, final PointDTO location, State state) {
    this.id = id;
    this.name = name;
    this.uf = uf;
    this.ibge = ibge;
    this.geolocation = geolocation;
    this.location = location;
    this.state = state;
  }

  public CityDTO(City city) {
    this.id = city.getId();
    this.name = city.getName();
    this.uf = city.getUf();
    this.ibge = city.getIbge();
    this.geolocation = city.getGeolocation();
    this.location = new PointDTO(city.getLocation());
    this.state = city.getState();
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Integer getUf() {
    return uf;
  }

  public Integer getIbge() {
    return ibge;
  }

  public String getGeolocation() {
    return geolocation;
  }

  public PointDTO getLocation() {
    return location;
  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }
}
