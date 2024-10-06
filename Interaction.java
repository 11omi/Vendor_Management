package com.Vendor.VendorMgmt.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "interactions")
public class Interaction {
    @Id
    private String interactionId;
    private String vendorId;  // Reference to Vendor
    private Date interactionDate;
    private String description;
    private String type;  // EMAIL, CALL, MEETING, etc.
    private String loggedBy;  // User who logged this interaction
}

