package com.bank.services.serviceImplentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.services.repository.ServiceRepository;
import com.bank.services.service.Services_offers_service;




@Service
public class service_offers_implmentation  implements Services_offers_service {
	
	
     @Autowired
	  private ServiceRepository ServiceRepository;
	
	 public List<String> getAllServiceByBranch(Integer branch_id) {
	        // Extract service names from the services list
	        return 	ServiceRepository.findByBranchId(branch_id);

	    }


}
