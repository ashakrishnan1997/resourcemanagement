package com.resource.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resource.app.model.FollowUpRegistration;
import com.resource.app.repository.iFollowUpRegistrationRepo;

@Service
public class FollowUpRegistrationService implements IFollowUpRegistrationService {
	
	@Autowired
	private iFollowUpRegistrationRepo ifollowUpRegistrationRepo;
	
    //to add follow Up Registration details
	@Override
	public FollowUpRegistration addFlUpRegistration(FollowUpRegistration followUpRegistration) {
		// TODO Auto-generated method stub
		return ifollowUpRegistrationRepo.save(followUpRegistration);
	}
	
    //to list all follow up registration details
	@Override
	public List<FollowUpRegistration> listAllFlUpRegistration() {
		// TODO Auto-generated method stub
		return ifollowUpRegistrationRepo.findAll();
	}

}
