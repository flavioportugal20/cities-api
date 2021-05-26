package com.github.flavioportugal20.dto;

import com.github.flavioportugal20.domain.City;
import com.github.flavioportugal20.domain.State;

import java.io.Serializable;


public class CityDTO implements Serializable {
  private static final long serialVersionUID = 1L;

  private Long id;
  private String name;
  private Integer ibge;
  private String geolocation;
  private PointDTO location;
  private StateDTO state;

  public CityDTO(final Long id, final String name, final Integer ibge, final String geolocation, final PointDTO location, final State state) {
    this.id = id;
    this.name = name;
    this.ibge = ibge;
    this.geolocation = geolocation;
    this.location = location;
    this.state = new StateDTO(state);
  }

  public CityDTO(City city) {
    this.id = city.getId();
    this.name = city.getName();
    this.ibge = city.getIbge();
    this.geolocation = city.getGeolocation();
    this.location = new PointDTO(city.getLocation());
    this.state = new StateDTO(city.getState());
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
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

  public StateDTO getState() {
    return state;
  }

  public void setState(StateDTO state) {
    this.state = state;
  }
}
