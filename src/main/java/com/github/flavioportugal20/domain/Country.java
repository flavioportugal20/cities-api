package com.github.flavioportugal20.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Country")
@Table(name = "pais")
public class Country {

  @Id
  private Long id;

  @Column(name = "nome")
  private String name;

  @Column(name = "nome_pt")
  private String portugueseName;

  @Column(name = "sigla")
  private String code;
  private Integer bacen;

  @JsonIgnore
  @OneToMany(mappedBy = "country")
  private List<State> states = new ArrayList<>();

  public Country() {
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

  public List<State> getStates() {
    return states;
  }

  public void setStates(List<State> states) {
    this.states = states;
  }
}
