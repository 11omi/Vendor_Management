package com.Vendor.VendorMgmt.service;

import com.Vendor.VendorMgmt.entity.Contract;
import com.Vendor.VendorMgmt.repository.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContractService {

    @Autowired
    private ContractRepository contractRepository;

    public Contract createContract(Contract contract) {
        return contractRepository.save(contract);
    }

    public List<Contract> getAllContracts() {
        return contractRepository.findAll();
    }

    public Contract getContractById(String contractId) {
        Optional<Contract> contract = contractRepository.findById(contractId);
        return contract.orElse(null);
    }

    public Contract updateContract(String contractId, Contract contractDetails) {
        Optional<Contract> contract = contractRepository.findById(contractId);
        if (contract.isPresent()) {
            Contract existingContract = contract.get();
            existingContract.setAmount(contractDetails.getAmount());
            existingContract.setDetails(contractDetails.getDetails());
            existingContract.setEndDate(contractDetails.getEndDate());
            return contractRepository.save(existingContract);
        }
        return null;
    }

    public void deleteContract(String contractId) {
        contractRepository.deleteById(contractId);
    }
}

