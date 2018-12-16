package com.petClinic.praty.services;

import com.petClinic.praty.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	
	Owner findByLastName(String lastName);
}
