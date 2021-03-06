package ru.onestyle.dsnimshchikov.config;

import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author dima
 *         Шаблон адаптер
 */
@Slf4j
public class Setting {

    private static Properties prop;

    static {
        prop = new Properties();
        try {
//            Thread.class.getClassLoader().getResourceAsStream("config.properties") //различные варианты доступа к файлу
            prop.load(new FileInputStream("config.properties"));
        } catch (IOException e) {
            log.error("!!!  Not loaded file config.properties");
        }
    }

    public static String getInputFileName() {
        return prop.getProperty("inputFile");
    }

    public static Integer deadLockSleep() {
        return Integer.valueOf(prop.getProperty("threads.deadlock.sleepTime"));
    }

    public static Integer getSleep() {
        return Integer.valueOf(prop.getProperty("threads.race.sleepTime"));
    }

}
