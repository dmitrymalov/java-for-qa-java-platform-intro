package com.db.edu.logger.api.businesslogic.service;

import com.db.edu.logger.dal.ConsoleLoggerSaver;

/**
 * Created by Java_1 on 23.04.2018.
 */

public class LogService {
    private LogMessageFilter filter = new LogMessageFilter();
    private LogMsgFormatter formatter = new LogMsgFormatter();
    private ConsoleLoggerSaver saver = new ConsoleLoggerSaver();

    public void log(String message) {
        if (filter.filter(message)) {
            String formattedMessage = formatter.format(message);
            saver.save(formattedMessage);
        }
    }

}