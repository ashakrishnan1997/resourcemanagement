package com.resource.app.service;

import java.util.List;

import com.resource.app.model.FollowUpRegistration;

public interface IFollowUpRegistrationService {
	
	public FollowUpRegistration addFlUpRegistration(FollowUpRegistration followUpRegistration);
	
	public List<FollowUpRegistration> listAllFlUpRegistration();

}
