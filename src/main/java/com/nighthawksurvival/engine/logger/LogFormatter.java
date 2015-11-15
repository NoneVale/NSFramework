package com.nighthawksurvival.engine.logger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class LogFormatter extends Formatter {

    private final String format = "[%s| %s| NS]: %s \n";

    @Override
    public String format(LogRecord record) {
        return String.format(this.format, getTime(), record.getLevel(), record.getMessage());
    }

    private String getTime() {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
        return dateFormat.format(date);
    }
}
