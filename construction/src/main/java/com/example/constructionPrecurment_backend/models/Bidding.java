package com.example.constructionPrecurment_backend.models;

import java.util.Date;

public class Bidding {
    private String projectName;
    private Date startDate;
    private Date endDate;
    private String contractorId;
    private String budget;

    public Bidding(String projectName, Date startDate, Date endDate, String contractorId, String budget) {
        this.projectName = projectName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.contractorId = contractorId;
        this.budget = budget;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getContractorId() {
        return contractorId;
    }

    public void setContractorId(String contractorId) {
        this.contractorId = contractorId;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }
}