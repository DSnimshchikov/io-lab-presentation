package ru.onestyle.dsnimshchikov.factory;

import ru.onestyle.dsnimshchikov.io.ProductReader;

import java.io.IOException;

/**
 * @author dima
 */
public class StrategyProductFactoryBuilder {

    private ProductReader reader;
    private String packageName;

    public StrategyProductFactoryBuilder(ProductReader reader) {
        this.reader = reader;
    }

    public StrategyProductFactoryBuilder withPackage(String packageName) {
        this.packageName = packageName;
        return this;
    }

    public ProductFactory build() throws IOException {
        return new ProductFactory().setReader(reader).setPackageName(getPackageName());
    }

    private String getPackageName() {
        return packageName == null ?
                "ru.onestyle.dsnimshchikov.entity"
                : packageName;
    }
}
