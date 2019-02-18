package me.ssoon.petclinic.services;

import java.util.Set;
import me.ssoon.petclinic.model.Pet;

public interface PetService {

  Pet findById(Long id);

  Pet save(Pet pet);

  Set<Pet> findAll();
}
