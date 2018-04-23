package com.db.edu;

import com.db.edu.logger.api.LoggerController;

/**
 * Created by Java_1 on 19.04.2018.
 */
public class LoggerTest {
    public static void main(String[] args) {
        LoggerController logger = new LoggerController();
        logger.log("Test Message");
    }
}