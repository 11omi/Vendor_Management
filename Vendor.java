package com.Vendor.VendorMgmt.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

    @Data
    @Document(collection = "vendors")
    public class Vendor {
        @Id
        private String id;
        private String name;
        private String email;
        private String phoneNumber;
        private String address;
        private String category;
        private String status;
        private Date onboardedDate;
        private Double performanceScore;
        private List<String> documentIds;  // Document references stored in GridFS
        private String createdBy;
        private Date createdDate;
        private String modifiedBy;
        private Date modifiedDate;
    }


