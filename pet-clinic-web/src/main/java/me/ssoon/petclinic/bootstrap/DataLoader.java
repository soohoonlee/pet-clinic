package me.ssoon.petclinic.bootstrap;

import me.ssoon.petclinic.model.Owner;
import me.ssoon.petclinic.model.Vet;
import me.ssoon.petclinic.services.OwnerService;
import me.ssoon.petclinic.services.VetService;
import me.ssoon.petclinic.services.map.OwnerServiceMap;
import me.ssoon.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

  private final OwnerService ownerService;
  private final VetService vetService;

  public DataLoader() {
    ownerService = new OwnerServiceMap();
    vetService = new VetServiceMap();
  }

  @Override
  public void run(final String... args) throws Exception {
    final Owner owner1 = new Owner();
    owner1.setId(1L);
    owner1.setFirstName("Michael");
    owner1.setLastName("Weston");
    ownerService.save(owner1);

    final Owner owner2 = new Owner();
    owner2.setId(2L);
    owner2.setFirstName("Fiona");
    owner2.setLastName("Glenanne");
    ownerService.save(owner2);

    System.out.println("Loaded Owners....");

    final Vet vet1 = new Vet();
    vet1.setId(1L);
    vet1.setFirstName("Sam");
    vet1.setLastName("Axe");
    vetService.save(vet1);

    final Vet vet2 = new Vet();
    vet2.setId(2L);
    vet2.setFirstName("Jessie");
    vet2.setLastName("Porter");
    vetService.save(vet1);

    System.out.println("Loaded Vets....");
  }
}
