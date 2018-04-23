package com.db.edu.logger.api;

import com.db.edu.logger.api.businesslogic.service.LogService;
import com.db.edu.logger.dal.ConsoleLoggerSaver;

public class LoggerController {

private LogService logService = new LogService();
    public void log(String message) {
        logService.log(message);
    }
}