package com.azr.cosmosdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AZRJob {

     @Autowired AZRServices aZRServices;
    // @Autowired AZRServices2 aZRServices2;
    @Value("${environment.connectionstring}")
    private String connectionString;

    @Scheduled(fixedRate = 86400000) //for development only
    public void runJob() throws Exception {



        ///-------------QUICK PARALLEL RUN------------------------//
        aZRServices.getEmployees(connectionString);
        //aZRServices1.getUserInfo(tugConnectionString);
        // aZRServices1.getUserHistory(tugConnectionString);        
        // ///--------------SERIES-----------------------------------//
        
        // aZRServices2.getHTMTimecardsNew(tugConnectionString); 
        // aZRServices2.getStationaryReport(tugConnectionString);
        // aZRServices2.getJobHistory(tugConnectionString);
        // aZRServices2.getDriverHistory(tugConnectionString);
    ///-----------------------------------------------------------//        
    }    
}
