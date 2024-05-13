package com.azr.cosmosdb;

public class Employee {

    private String partitionKey;
    private String rowKey;
    private String Timestamp;
    public String fullName;
    public String email;  

    

    public Employee(String partitionKey, String rowKey, String timestamp, String fullName, String email) {
        this.partitionKey = partitionKey;
        this.rowKey = rowKey;
        Timestamp = timestamp;
        this.fullName = fullName;
        this.email = email;
    }
    
    public String getPartitionKey() {
        return partitionKey;
    }
    public void setPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
    }
    public String getRowKey() {
        return rowKey;
    }
    public void setRowKey(String rowKey) {
        this.rowKey = rowKey;
    }
    public String getTimestamp() {
        return Timestamp;
    }
    public void setTimestamp(String timestamp) {
        Timestamp = timestamp;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


    
    
}
