package com.Vendor.VendorMgmt.controller;




import com.Vendor.VendorMgmt.entity.Vendor;
import com.Vendor.VendorMgmt.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vendors")
public class VendorController {

    @Autowired
    private VendorService vendorService;

    @PostMapping
    public Vendor createVendor(@RequestBody Vendor vendor) {
        return vendorService.createVendor(vendor);
    }

    @GetMapping
    public List<Vendor> getAllVendors() {
        return vendorService.getAllVendors();
    }

    @GetMapping("/{id}")
    public Vendor getVendorById(@PathVariable("id") String id) {
        return vendorService.getVendorById(id);
    }

    @PutMapping("/{id}")
    public Vendor updateVendor(@PathVariable("id") String id, @RequestBody Vendor vendor) {
        return vendorService.updateVendor(id, vendor);
    }

    @DeleteMapping("/{id}")
    public void deleteVendor(@PathVariable("id") String id) {
        vendorService.deleteVendor(id);
    }
}

