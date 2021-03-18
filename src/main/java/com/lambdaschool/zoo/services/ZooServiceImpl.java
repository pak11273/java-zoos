package com.lambdaschool.zoo.services;

import com.lambdaschool.zoo.models.Zoo;
import com.lambdaschool.zoo.repositories.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "zooService")
public class ZooServiceImpl implements ZooService {
    @Autowired
    private ZooRepository zoorepos;


    @Override
    public List<Zoo> findAll() {
        List<Zoo> list = new ArrayList<>();

        zoorepos.findAll().iterator().forEachRemaining(list::add);
        return list;
    }
}
