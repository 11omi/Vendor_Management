package com.Vendor.VendorMgmt.repository;


import com.Vendor.VendorMgmt.entity.Interaction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InteractionRepository extends MongoRepository<Interaction, String> {
}
