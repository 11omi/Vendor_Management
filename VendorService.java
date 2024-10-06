package com.Vendor.VendorMgmt.service;

import com.Vendor.VendorMgmt.entity.Vendor;
import com.Vendor.VendorMgmt.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VendorService {

    @Autowired
    private VendorRepository vendorRepository;

    public Vendor createVendor(Vendor vendor) {
        return vendorRepository.save(vendor);
    }

    public List<Vendor> getAllVendors() {
        return vendorRepository.findAll();
    }

    public Vendor getVendorById(String vendorId) {
        Optional<Vendor> vendor = vendorRepository.findById(vendorId);
        return vendor.orElse(null);
    }

    public Vendor updateVendor(String vendorId, Vendor vendorDetails) {
        Optional<Vendor> vendor = vendorRepository.findById(vendorId);
        if (vendor.isPresent()) {
            Vendor existingVendor = vendor.get();
            existingVendor.setName(vendorDetails.getName());
            existingVendor.setEmail(vendorDetails.getEmail());
            return vendorRepository.save(existingVendor);
        }
        return null;
    }

    public void deleteVendor(String vendorId) {
        vendorRepository.deleteById(vendorId);
    }
}

