package me.ssoon.petclinic.services;

import java.util.Set;
import me.ssoon.petclinic.model.Vet;

public interface VetService {

  Vet findById(Long id);

  Vet save(Vet vet);

  Set<Vet> findAll();
}
