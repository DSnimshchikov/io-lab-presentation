package ru.onestyle.dsnimshchikov;

import ru.onestyle.dsnimshchikov.config.Setting;
import ru.onestyle.dsnimshchikov.factory.ProductFactory;
import ru.onestyle.dsnimshchikov.factory.ProductFactoryBuilder;
import ru.onestyle.dsnimshchikov.io.MemoryFileReader;
import ru.onestyle.dsnimshchikov.io.ProductFileReader;
import ru.onestyle.dsnimshchikov.io.ProductReader;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author dima
 */
public class Application {

    public static void main(String[] args) throws IOException {
        String packageName ="ru.onestyle.dsnimshchikov.entity";

        ProductFactory productFactory = ProductFactoryBuilder
                .withReader(getReaderStrategy())
                .withPackage(packageName)
                .build();

        productFactory.readProduct();
    }

    private static ProductReader getReaderStrategy() throws IOException {
        boolean isMoreMemory = Runtime.getRuntime().freeMemory()/1024/1024 > 200;
        ProductFileReader reader = new ProductFileReader(Setting.getInputFileName());
        return isMoreMemory?new MemoryFileReader(reader): reader;
    }
}
