package com.lambdaschool.zoo.services;

import com.lambdaschool.zoo.models.Animal;
import com.lambdaschool.zoo.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "animalService")
public class AnimalServiceImpl implements AnimalService {

    @Autowired
    private AnimalRepository animalrepos;

    @Override
    public List<Animal> findAnimalCount() {
        List<Animal> list = new ArrayList<>();

        animalrepos.findAll().iterator().forEachRemaining(list::add);
        return list;
    }
}
