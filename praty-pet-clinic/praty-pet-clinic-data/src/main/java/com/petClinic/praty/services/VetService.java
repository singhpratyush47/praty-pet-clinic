package com.petClinic.praty.services;

import java.util.Set;

import com.petClinic.praty.model.Vet;

public interface VetService {

	Vet save(Vet vet);
	
	Set<Vet> findAll();
	
	Vet findById(Long id);
}
