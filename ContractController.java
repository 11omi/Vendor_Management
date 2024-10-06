package com.Vendor.VendorMgmt.controller;




import com.Vendor.VendorMgmt.entity.Contract;
import com.Vendor.VendorMgmt.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contracts")
public class ContractController {

    @Autowired
    private ContractService contractService;

    @PostMapping
    public Contract createContract(@RequestBody Contract contract) {
        return contractService.createContract(contract);
    }

    @GetMapping
    public List<Contract> getAllContracts() {
        return contractService.getAllContracts();
    }

    @GetMapping("/{id}")
    public Contract getContractById(@PathVariable("id") String id) {
        return contractService.getContractById(id);
    }

    @PutMapping("/{id}")
    public Contract updateContract(@PathVariable("id") String id, @RequestBody Contract contract) {
        return contractService.updateContract(id, contract);
    }

    @DeleteMapping("/{id}")
    public void deleteContract(@PathVariable("id") String id) {
        contractService.deleteContract(id);
    }
}

