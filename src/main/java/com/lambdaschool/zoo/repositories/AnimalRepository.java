package com.lambdaschool.zoo.repositories;

import com.lambdaschool.zoo.models.Animal;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AnimalRepository extends CrudRepository<Animal, Long> {
    @Query(value = "SELECT animalid, count(animalid) as c" +
            "ountmenus " +
            "FROM animals " +
            "ORDER BY animalid desc",
            nativeQuery = true)
    List<Animal> findAnimalCount();
}
