package com.terranet.pdb.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.terranet.pdb.model.Plan;

@Repository
public interface PlanDAO extends JpaRepository<Plan, Integer>{
	List<Plan> findPlanByCity(String city);

}
