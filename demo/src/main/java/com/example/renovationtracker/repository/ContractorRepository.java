package com.example.renovationtracker.repository;

import com.example.renovationtracker.model.Contractor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractorRepository extends JpaRepository<Contractor, Long> {
}