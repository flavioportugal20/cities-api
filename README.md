# Cities API
```shell script
Api Rest para calcular distância entre cidades.
```

### HOSTS

```shell script
from = id da cidade inicial
to = id da cidade final

Medir distância em Milas
HOST/distances/by-points?from=1&to=36

Medir distância em Metros
HOST/distances/by-cube?from=1&to=36

Medir distância em Kilometros
HOST/distances/by-math?from=1&to=36&unit=KILOMETERS

Pageable Estados 
HOST/staties?page=0&size=20

Pageable Cidades 
HOST/cities?page=0&size=20

Pageable Países 
HOST/countries?page=0&size=20
```

## Requirements

* Git
* Java 8
* IntelliJ Community
* Heroku CLI

## DataBase

### Postgres

* [Postgres]

### Populate

* [data](https://github.com/chinnonsantos/sql-paises-estados-cidades/tree/master/PostgreSQL)

```shell script
cd ~/workspace/sql-paises-estados-cidades/PostgreSQL

psql -U user -h localhost -d dbName -f pais.sql
psql -U user -h localhost -d dbName -f estado.sql
psql -U user -h localhost -d dbName -f cidade.sql

Terminal do banco
psql -h localhost -U user dbName

CREATE EXTENSION cube; 
CREATE EXTENSION earthdistance;
```

* [Postgres Earth distance](https://www.postgresql.org/docs/current/earthdistance.html)
* [earthdistance--1.0--1.1.sql](https://github.com/postgres/postgres/blob/master/contrib/earthdistance/earthdistance--1.0--1.1.sql)
* [OPERATOR <@>](https://github.com/postgres/postgres/blob/master/contrib/earthdistance/earthdistance--1.1.sql)
* [postgrescheatsheet](https://postgrescheatsheet.com/#/tables)
* [datatype-geometric](https://www.postgresql.org/docs/current/datatype-geometric.html)

### Access

```shell script
psql -U postgres_user_city cities
```

### Query Earth Distance

Point
```roomsql
select ((select lat_lon from cidade where id = 4929) <@> (select lat_lon from cidade where id=5254)) as distance;
```

Cube
```roomsql
select earth_distance(
    ll_to_earth(-21.95840072631836,-47.98820114135742), 
    ll_to_earth(-22.01740074157715,-47.88600158691406)
) as distance;
```

## Spring Boot

* [https://start.spring.io/](https://start.spring.io/)

+ Java 8
+ Gradle Project
+ Jar
+ Spring Web
+ Spring Data JPA
+ PostgreSQL Driver

### Spring Data

* [jpa.query-methods](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods)

### Properties

* [appendix-application-properties](https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-application-properties.html)
* [jdbc-database-connectio](https://www.codejava.net/java-se/jdbc/jdbc-database-connection-url-for-common-databases)

### Types

* [JsonTypes](https://github.com/vladmihalcea/hibernate-types)
* [UserType](https://docs.jboss.org/hibernate/orm/3.5/api/org/hibernate/usertype/UserType.html)

## Heroku

* [DevCenter](https://devcenter.heroku.com/articles/getting-started-with-gradle-on-heroku)

