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

import com.resource.app.model.FollowUpRegistration;
import com.resource.app.service.IFollowUpRegistrationService;

@CrossOrigin
@RestController
@RequestMapping("/")
public class FollowUpRegistrationController {

	// object of service
	@Autowired
	private IFollowUpRegistrationService iFollowUpRegistrationService;

	// add the followUpRegistration details
	@PostMapping("FollowUpRegistration")
	public ResponseEntity<FollowUpRegistration> addflUpRegistration(
			@RequestBody FollowUpRegistration FlUpRegistration) {
		return new ResponseEntity<FollowUpRegistration>(
				iFollowUpRegistrationService.addFlUpRegistration(FlUpRegistration), HttpStatus.OK);
	}

	// get all the follow up registration
	@GetMapping("FollowUpRegistration")
	public ResponseEntity<List<FollowUpRegistration>> listAllflUpRegistration() {
		return new ResponseEntity<List<FollowUpRegistration>>(iFollowUpRegistrationService.listAllFlUpRegistration(),
				HttpStatus.OK);

	}

}
