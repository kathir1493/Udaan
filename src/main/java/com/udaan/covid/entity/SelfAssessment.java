package com.udaan.covid.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class SelfAssessment {

    //create table self_assesment (id integer , user_id integer,symptoms varchar(255) , travelHistory boolean , contactWithPatient boolean , primary key (id));

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Integer id;
    Integer userId;
    String symptoms;
    Boolean travelHistory;
    Boolean contactWithPatient;

}
