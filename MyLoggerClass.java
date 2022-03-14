package com.company;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyLoggerClass {
    private static Logger logger = Logger.getLogger(MyLoggerClass.class.getName());

    public MyLoggerClass() {
    }

    public static Logger getLOGGER() {
        FileHandler fileHandler = null;

        try {
            fileHandler = new FileHandler("./log.txt");
            logger.addHandler(fileHandler);
            fileHandler.setLevel(Level.ALL);
            logger.setLevel(Level.ALL);
        } catch (IOException var2) {
            logger.log(Level.WARNING, "Error occur in FileHandler.", var2);
        }

        return logger;
    }
}
