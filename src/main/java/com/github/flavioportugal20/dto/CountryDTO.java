package com.github.flavioportugal20.dto;

import com.github.flavioportugal20.domain.Country;

import java.io.Serializable;

public class CountryDTO implements Serializable {
  private static final long serialVersionUID = 1L;

  private Long id;
  private String name;
  private String portugueseName;
  private String code;
  private Integer bacen;

  public CountryDTO() {
  }

  public CountryDTO(Country country) {
    this.id = country.getId();
    this.name = country.getName();
    this.portugueseName = country.getPortugueseName();
    this.code = country.getCode();
    this.bacen = country.getBacen();
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

}
