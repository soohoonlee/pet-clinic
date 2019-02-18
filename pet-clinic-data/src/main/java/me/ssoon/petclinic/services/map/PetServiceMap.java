package me.ssoon.petclinic.services.map;

import java.util.Set;
import me.ssoon.petclinic.model.Pet;
import me.ssoon.petclinic.services.PetService;
import org.springframework.stereotype.Service;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

  @Override
  public Set<Pet> findAll() {
    return super.findAll();
  }

  @Override
  public void deleteById(final Long id) {
    super.deleteById(id);
  }

  @Override
  public void delete(final Pet object) {
    super.delete(object);
  }

  @Override
  public Pet save(final Pet object) {
    return super.save(object.getId(), object);
  }

  @Override
  public Pet findById(final Long id) {
    return super.findById(id);
  }
}
