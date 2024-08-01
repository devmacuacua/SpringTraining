package com.andela.training.springTraining.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.andela.training.springTraining.api.model.entity.Compra;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Long> {
	

}
