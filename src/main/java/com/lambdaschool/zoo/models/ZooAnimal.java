package com.lambdaschool.zoo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "zooanimals")
@IdClass(ZooAnimalId.class)
public class ZooAnimal extends Auditable implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "zooid")
    @JsonIgnoreProperties(value = "animals", allowSetters = true)
    private Zoo zoo;

    @Id
    @ManyToOne
    @JoinColumn(name = "animalId")
    @JsonIgnoreProperties(value = "zoos", allowSetters = true)
    private Animal animal;

    private String fromzoo;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ZooAnimal that = (ZooAnimal) o;
        return ((this.zoo == null) ? 0 : this.zoo.getZooid()) ==
               ((that.zoo == null) ? 0 : that.zoo.getZooid()) &&
               ((animal == null) ? 0 : animal.getAnimalid()) ==
               ((that.animal == null) ? 0 : that.animal.getAnimalid());
    }

    @Override
    public int hashCode() {
        return 2024;
    }

    public ZooAnimal() {
    }

    public ZooAnimal(Zoo zoo, Animal animal, String fromzoo) {
        this.zoo = zoo;
        this.animal = animal;
        this.fromzoo = fromzoo;
    }

    public ZooAnimal(Zoo zoo, Animal animal) {
        this.zoo = zoo;
        this.animal = animal;
        this.fromzoo = null;
    }

    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getFromzoo() {
        return fromzoo;
    }

    public void setFromzoo(String fromzoo) {
        this.fromzoo = fromzoo;
    }
}
