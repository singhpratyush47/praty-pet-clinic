package com.petClinic.praty.bootstrap;

import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.petClinic.praty.model.Owner;
import com.petClinic.praty.model.Vet;
import com.petClinic.praty.services.OwnerService;
import com.petClinic.praty.services.VetService;
import com.petClinic.praty.services.map.OwnerServiceMap;
import com.petClinic.praty.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner{

	private final OwnerService ownerService;
	private final VetService vetService;
	
	public DataLoader(OwnerService ownerService, VetService vetService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	@Override
	public void run(String... args) throws Exception {
		Owner owner1=new Owner();
		owner1.setFirstName("pratyush");
		owner1.setLastName("Singh");
		
		ownerService.save(owner1);
		
		Owner owner2=new Owner();
		owner2.setFirstName("Dhanunjay");
		owner2.setLastName("Pandey");
		
		ownerService.save(owner2);
		
		System.out.println("Loaded Owners.....");
		Set<Owner> ownersSet=ownerService.findAll();
		System.out.println("Owners are -->"+ownersSet);
		Vet vet1=new Vet();
		vet1.setFirstName("Ranjan");
		vet1.setLastName("Bhaiya");
		
		vetService.save(vet1);

		Vet vet2=new Vet();
		vet2.setFirstName("Mahesh");
		vet2.setLastName("KatlaGunta");

		vetService.save(vet2);
		System.out.println("Loaded Vets.....");
		Set<Vet> setOfVets=vetService.findAll();
		System.out.println("Vets are -->"+setOfVets);
	}
}
