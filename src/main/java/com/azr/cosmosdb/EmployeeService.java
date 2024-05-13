package com.azr.cosmosdb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azure.data.tables.TableClient;
import com.azure.data.tables.TableClientBuilder;


@Service
public class EmployeeService {

        private static final Logger log = LoggerFactory.getLogger(EmployeeService.class);

    // @Autowired
    // private GatewaysRepo gatewaysRepo;
    
    public void getEmployees(String connectionString){

        System.out.println("Date in UTC: " + new Date().toString());

        log.info("(||-- IN getEmployees --||) ENTER");

        String tableName = "EmployeeTest"; //DriverHistory
        TableClient tableClient = new TableClientBuilder()
            .connectionString(connectionString)
            .tableName(tableName)
            .buildClient();   

        List<Employee> list = new ArrayList<>();        

        tableClient.listEntities().forEach(tableEntity -> {
            String partitionKey = (tableEntity.getPartitionKey() == null ? " " : tableEntity.getPartitionKey()); 
            String rowKey = (tableEntity.getRowKey() == null ? " " : tableEntity.getRowKey()); 
            //String Timestamp = (tableEntity.getProperty("Timestamp") == null ? " " : (String) tableEntity.getProperty("Timestamp").toString()); 
            String fullName = (tableEntity.getProperty("fullName") == null ? " " : (String) tableEntity.getProperty("fullName").toString()); 
            String email = (tableEntity.getProperty("email") == null ? " " : (String) tableEntity.getProperty("email").toString());       


            
            System.out.println("\n\n ------------RESULT-------------");

            System.out.println(
                "partitionKey: " + partitionKey +
                "rowKey: " + rowKey + 
                //"Timestamp: " + Timestamp + 
                "fullName: " + fullName + 
                ", email: " + email   
            );

            System.out.println("\n\n ------------RESULT-------------");

            // list.add(
            //     new Employee(                
            //         partitionKey,
            //         rowKey, 
            //         Timestamp,
            //         fullName,                    
            //         email
            // ));    
         });  

        log.info("(||-- END getEmployees --||) FINAL");
    }        
}