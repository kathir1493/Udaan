package com.udaan.covid.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Zone {

    @Id
    Integer pincode;
    Integer count;
    String status;

}
