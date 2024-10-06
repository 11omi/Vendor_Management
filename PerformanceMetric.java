package com.Vendor.VendorMgmt.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "performance_metrics")
public class PerformanceMetric {
    @Id
    private String metricId;
    private String vendorId;  // Reference to Vendor
    private String metricType;
    private Double score;
    private String comments;
    private String evaluatedBy;
    private Date evaluationDate;
}
