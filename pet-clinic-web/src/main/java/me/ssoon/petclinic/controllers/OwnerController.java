package me.ssoon.petclinic.controllers;

import me.ssoon.petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

  private final OwnerService ownerService;

  public OwnerController(final OwnerService ownerService) {
    this.ownerService = ownerService;
  }

  @GetMapping({"", "/", "/index", "index.html"})
  public String listOwners(final Model model) {
    model.addAttribute("owners", ownerService.findAll());
    return "owners/index";
  }
}
