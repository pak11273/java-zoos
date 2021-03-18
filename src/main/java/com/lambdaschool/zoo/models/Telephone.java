package com.lambdaschool.zoo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "telephones")
public class Telephone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long phoneid;

    @Column(nullable = false)
    private String phonetype;

    @ManyToOne
    @JoinColumn(name = "zooid", nullable = false)
    @JsonIgnoreProperties(value = "telephones")
    private Zoo zoo;
//    INSERT INTO telephones (phoneid, phonetype, phonenumber, zooid, createdby, createddate, lastmodifiedby,

    private String phonenumber;

    private String createdby;
    private String createddate;
    private String lastmodifiedby;
    private String lastmodifieddate;
}
