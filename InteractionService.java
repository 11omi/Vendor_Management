package com.Vendor.VendorMgmt.service;


import com.Vendor.VendorMgmt.entity.Interaction;
import com.Vendor.VendorMgmt.repository.InteractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InteractionService {

    @Autowired
    private InteractionRepository interactionRepository;

    public Interaction createInteraction(Interaction interaction) {
        return interactionRepository.save(interaction);
    }

    public List<Interaction> getAllInteractions() {
        return interactionRepository.findAll();
    }

    public Interaction getInteractionById(String interactionId) {
        Optional<Interaction> interaction = interactionRepository.findById(interactionId);
        return interaction.orElse(null);
    }

    public Interaction updateInteraction(String interactionId, Interaction interactionDetails) {
        Optional<Interaction> interaction = interactionRepository.findById(interactionId);
        if (interaction.isPresent()) {
            Interaction existingInteraction = interaction.get();
            existingInteraction.setDescription(interactionDetails.getDescription());
            existingInteraction.setType(interactionDetails.getType());
            return interactionRepository.save(existingInteraction);
        }
        return null;
    }

    public void deleteInteraction(String interactionId) {
        interactionRepository.deleteById(interactionId);
    }
}

