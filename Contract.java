package com.Vendor.VendorMgmt.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "contracts")
public class Contract {
    @Id
    private String contractId;
    private String vendorId;  // Reference to Vendor
    private Date startDate;
    private Date endDate;
    private String details;
    private Double amount;
    private String status;
}



