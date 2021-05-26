package com.github.flavioportugal20.domain;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.springframework.data.geo.Point;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cidade")
@TypeDefs(value = {
    @TypeDef(name = "point", typeClass = PointType.class)
})
public class City {

  @Id
  private Long id;

  @Column(name = "nome")
  private String name;
  private Integer ibge;

  @Column(name = "lat_lon")
  private String geolocation;

  @Type(type = "point")
  @Column(name = "lat_lon", updatable = false, insertable = false)
  private Point location;

  @ManyToOne
  @JoinColumn(name="uf", referencedColumnName = "id")
  private State state;

  public City() {
  }

  public City(final Long id, final String name, final Integer ibge, final String geolocation, final Point location, final State state) {
    this.id = id;
    this.name = name;
    this.state = state;
    this.ibge = ibge;
    this.geolocation = geolocation;
    this.location = location;
    this.state = state;
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

  public Point getLocation() {
    return location;
  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    City city = (City) o;
    return Objects.equals(id, city.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
