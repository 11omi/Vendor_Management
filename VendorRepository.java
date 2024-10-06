package com.Vendor.VendorMgmt.repository;


import com.Vendor.VendorMgmt.entity.Vendor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VendorRepository extends MongoRepository<Vendor, String> {
}
