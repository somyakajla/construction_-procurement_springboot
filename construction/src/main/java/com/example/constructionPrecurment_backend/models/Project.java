package com.example.constructionPrecurment_backend.models;


import com.example.constructionPrecurment_backend.userType.BudgetType;
import com.example.constructionPrecurment_backend.userType.ProjectStatus;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.UUID;

@Document(collection = "Project")
public class Project {
    private UUID projectId;
    private String projectName;
    private String ownerEmail;
    private Date startDate;
    private Date endDate;
    private String city;
    private String state;
    private String ownerName;
    private String phoneNumber;
    private String budget;
    private BudgetType currencyType;
    private ProjectStatus status;

    public Project(){}

    public Project(UUID projectId, String projectName, String ownerEmail, Date startDate, Date endDate, String city, String state, String ownerName, String phoneNumber, String budget, BudgetType currencyType, ProjectStatus status) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.ownerEmail = ownerEmail;
        this.startDate = startDate;
        this.endDate = endDate;
        this.city = city;
        this.state = state;
        this.ownerName = ownerName;
        this.phoneNumber = phoneNumber;
        this.budget = budget;
        this.currencyType = currencyType;
        this.status = status;
    }

    public UUID getProjectId() {
        return projectId;
    }

    public void setProjectId(UUID projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public BudgetType getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(BudgetType currencyType) {
        this.currencyType = currencyType;
    }

    public ProjectStatus getStatus() {
        return status;
    }

    public void setStatus(ProjectStatus status) {
        this.status = status;
    }
}
