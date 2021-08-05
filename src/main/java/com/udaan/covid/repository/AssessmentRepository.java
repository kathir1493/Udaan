package com.udaan.covid.repository;

import com.udaan.covid.entity.SelfAssessment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssessmentRepository extends JpaRepository<SelfAssessment,SelfAssessment> {


}
