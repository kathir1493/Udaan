package com.udaan.covid.repository;

import com.udaan.covid.entity.TestResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultRepository extends JpaRepository<TestResult,TestResult> {
}
