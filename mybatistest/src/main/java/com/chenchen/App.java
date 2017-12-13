package com.chenchen;


import com.chenchen.models.User;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.*;

/**
 * Hello world!
 */
public class App {
    static Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) {
        System.out.println("Hello World!");


        // Example 1

//        BasicConfigurator.configure();
//
//        logger.info("Entering application");
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        User user = new User();
//        logger.info("Exiting application");

        // Example 2
        PropertyConfigurator.configure("src/main/resources/log4j.properties");

        logger.info("Entering application");
        User user = new User();
        logger.info("Exiting application");
    }
}
