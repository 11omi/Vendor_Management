package com.Vendor.VendorMgmt.repository;

import com.Vendor.VendorMgmt.entity.Contract;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContractRepository extends MongoRepository<Contract, String> {
}
