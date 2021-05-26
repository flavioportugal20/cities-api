package com.github.flavioportugal20.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
  private List<State> staties = new ArrayList<>();

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
    return staties;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Country country = (Country) o;
    return Objects.equals(id, country.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
