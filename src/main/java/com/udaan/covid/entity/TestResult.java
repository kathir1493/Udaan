package com.udaan.covid.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.Instant;

@Data
@Entity
public class TestResult {


    @Id
    Integer id;
    Integer userId;
    String result;
    Instant createdAt;
    Integer updatedBy;


}
