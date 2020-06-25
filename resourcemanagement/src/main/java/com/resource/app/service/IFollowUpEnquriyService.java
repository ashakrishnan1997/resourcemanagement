package com.resource.app.service;

import java.util.List;

import com.resource.app.model.FollowUpEnquiry;

public interface IFollowUpEnquriyService {
	
	public FollowUpEnquiry addFollowUpEnquiry(FollowUpEnquiry flUpEnquiry);
	
	public List<FollowUpEnquiry> listFlUpEnquiry();

}
