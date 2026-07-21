package com.generation.fithubrh.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.fithubrh.model.RH;


public interface RHRepository extends JpaRepository<RH, Long>{

	public List<RH> findAllByEmailContainingIgnoreCase(String email);
	
}
