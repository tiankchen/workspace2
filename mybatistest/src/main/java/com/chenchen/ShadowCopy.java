package com.chenchen;

import com.chenchen.models.Professor;
import com.chenchen.models.Student;
import com.chenchen.models.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShadowCopy {


    public static Logger logger = LoggerFactory.getLogger(ShadowCopy.class);

    public static void main(String[] args) {

        String s1 = "chenchen";
        String s2 = "chenchen";
        s2 = "name";

        User user = new User();
        user.setName("chenchen");
        user.setAge(18);

        User newUser = user;

        System.out.println(user);
        System.out.println(newUser);

        logger.info("Hello world");
        logger.info("Hello {}, my name is {}", "chenchen", "idea");


        org.apache.log4j.Logger n = org.apache.log4j.Logger.getLogger("aaa");

        logger.info(logger.getName());

        RuntimeException exception = new RuntimeException();
        logger.error("test exception: {}", exception);

        logger.error("aaaa");
    }

}