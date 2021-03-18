package com.lambdaschool.zoo.models;

import javax.persistence.*;

@Entity
@Table(name = "zoos")
public class Zoo {

//    INSERT INTO zoos (zooid, zooname, createdby, createddate, lastmodifiedby, lastmodifieddate)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long zooid;

    @Column(nullable = false)
    private String zooname;

    private String createdby;
    private String createddate;
    private String lastmodifiedby;
    private String lastmodifieddate;



}
