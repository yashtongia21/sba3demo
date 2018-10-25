package com.terranet.pdb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.terranet.pdb.dao.PlanDAO;
import com.terranet.pdb.model.Plan;
@Service
public class PlanServiceImplementation implements PlanService {
	@Autowired
	private PlanDAO planRepo;
	
	@Override
	public Plan addPlan(Plan plan) {
		return planRepo.save(plan);
	}

	@Override
	public Plan updatePlan(Plan plan) {
		return planRepo.save(plan);
	}

	@Override
	public boolean deletePlan(int planId) {
		boolean isDeleted=false;
		if(planRepo.existsById(planId)) {
			planRepo.deleteById(planId);
			isDeleted=true;
		}
		return isDeleted;
	}

	@Override
	public Plan getById(int planId) {
		Plan plan = null;

		Optional<Plan> optPlan = planRepo.findById(planId);
		if (optPlan.isPresent()) {
			plan = optPlan.get();
		}
		return plan;
	}

	@Override
	public List<Plan> getAllPlans() {
		return planRepo.findAll();
	}

	@Override
	public List<Plan> findPlanByCity(String city) {
		// TODO Auto-generated method stub
		return planRepo.findPlanByCity(city);
	}

	
}
