package com.petClinic.praty.services;

import java.util.Set;

import com.petClinic.praty.model.Pet;

public interface PetService {

	
	Pet save(Pet pet);
	
	Set<Pet> findAll();
	
	Pet findById(Long id);
}
