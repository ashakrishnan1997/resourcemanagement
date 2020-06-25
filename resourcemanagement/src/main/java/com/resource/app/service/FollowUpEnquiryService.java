package com.resource.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resource.app.model.FollowUpEnquiry;
import com.resource.app.repository.iFollowUpEnquiryRepo;

@Service
public class FollowUpEnquiryService implements IFollowUpEnquriyService{
	
	@Autowired
	private iFollowUpEnquiryRepo iFlUpEnquiryRepo;

	@Override
	public FollowUpEnquiry addFollowUpEnquiry(FollowUpEnquiry flUpEnquiry) {
		// TODO Auto-generated method stub
		return iFlUpEnquiryRepo.save(flUpEnquiry);
	}

	@Override
	public List<FollowUpEnquiry> listFlUpEnquiry() {
		// TODO Auto-generated method stub
		return iFlUpEnquiryRepo.findAll();
	}

}
