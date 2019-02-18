package me.ssoon.petclinic.services;

import me.ssoon.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

  Owner findByLastName(String lastName);

}
