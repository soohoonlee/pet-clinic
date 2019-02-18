package me.ssoon.petclinic.services.map;

import java.util.Set;
import me.ssoon.petclinic.model.Vet;
import me.ssoon.petclinic.services.CrudService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

  @Override
  public Set<Vet> findAll() {
    return super.findAll();
  }

  @Override
  public void deleteById(final Long id) {
    super.deleteById(id);
  }

  @Override
  public void delete(final Vet object) {
    super.delete(object);
  }

  @Override
  public Vet save(final Vet object) {
    return super.save(object.getId(), object);
  }

  @Override
  public Vet findById(final Long id) {
    return super.findById(id);
  }
}
