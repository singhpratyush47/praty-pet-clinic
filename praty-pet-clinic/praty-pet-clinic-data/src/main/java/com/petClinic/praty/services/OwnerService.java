package com.petClinic.praty.services;

import java.util.Set;
import com.petClinic.praty.model.Owner;

public interface OwnerService {

	Owner findById(Long id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();
	
	Owner findByLastName(String lastName);
}
