package com.example.thehealingmeal.data.repository;

import com.example.thehealingmeal.data.domain.SnackOrTeaCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SnackOrTeaCategoryRepository extends JpaRepository<SnackOrTeaCategory, Long> {
    Optional<SnackOrTeaCategory> findById(long id);
}
