package com.Vendor.VendorMgmt.controller;


import com.Vendor.VendorMgmt.entity.Interaction;
import com.Vendor.VendorMgmt.service.InteractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/interactions")
public class InteractionController {

    @Autowired
    private InteractionService interactionService;

    @PostMapping
    public Interaction createInteraction(@RequestBody Interaction interaction) {
        return interactionService.createInteraction(interaction);
    }

    @GetMapping
    public List<Interaction> getAllInteractions() {
        return interactionService.getAllInteractions();
    }

    @GetMapping("/{id}")
    public Interaction getInteractionById(@PathVariable("id") String id) {
        return interactionService.getInteractionById(id);
    }

    @PutMapping("/{id}")
    public Interaction updateInteraction(@PathVariable("id") String id, @RequestBody Interaction interaction) {
        return interactionService.updateInteraction(id, interaction);
    }

    @DeleteMapping("/{id}")
    public void deleteInteraction(@PathVariable("id") String id) {
        interactionService.deleteInteraction(id);
    }
}

