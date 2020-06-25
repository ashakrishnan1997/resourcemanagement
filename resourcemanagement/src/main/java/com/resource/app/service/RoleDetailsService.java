package com.resource.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.resource.app.model.RoleDetails;
import com.resource.app.repository.iRoleDetailsRepo;

@Service
public class RoleDetailsService implements iRoleDetailsService{
	
	@Autowired
	private iRoleDetailsRepo roleDetailsRepo;
	
	@Transactional
	@Override
	public RoleDetails addRoleDetails(RoleDetails roleDetails) {
		// TODO Auto-generated method stub
		return roleDetailsRepo.save(roleDetails);
	}

	@Override
	public List<RoleDetails> listRoleDetails() {
		// TODO Auto-generated method stub
		return roleDetailsRepo.findAll();
	}

	@Override
	public RoleDetails findByRoleId(Integer roleId) {
		// TODO Auto-generated method stub
		Optional<RoleDetails> findRoleId=roleDetailsRepo.findById(roleId);
		RoleDetails roleDetails=findRoleId.isPresent()? findRoleId.get():null;
		return roleDetails;
	}
	


}
