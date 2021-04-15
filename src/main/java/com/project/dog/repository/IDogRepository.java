package com.project.dog.repository;

import com.project.dog.domain.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDogRepository extends JpaRepository <Dog, Long> {
}
