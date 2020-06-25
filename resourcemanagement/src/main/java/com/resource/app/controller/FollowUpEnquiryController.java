package com.resource.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resource.app.model.FollowUpEnquiry;
import com.resource.app.service.IFollowUpEnquriyService;

@CrossOrigin
@RestController
@RequestMapping("/")
public class FollowUpEnquiryController {
	@Autowired
	private IFollowUpEnquriyService iFlUpEnquiryService;
	
	//add follow up enquiry details
	@PostMapping("FollowUpEnquiey")
	private ResponseEntity<FollowUpEnquiry> addFollowUpEnquiry (@RequestBody FollowUpEnquiry followUpEnquiry){
		return new ResponseEntity<FollowUpEnquiry>(iFlUpEnquiryService.addFollowUpEnquiry(followUpEnquiry),HttpStatus.OK);
	}
	
    //list all follow up enquiry
	@GetMapping("FollowUpEnquiey")
	private ResponseEntity <List<FollowUpEnquiry>> listAllFlUpEnquiry(){
		return new ResponseEntity<List<FollowUpEnquiry>>(iFlUpEnquiryService.listFlUpEnquiry(),HttpStatus.OK);
		
	}
	
	
	

}
