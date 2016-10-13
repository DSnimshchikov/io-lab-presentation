package ru.onestyle.dsnimshchikov.factory;

import ru.onestyle.dsnimshchikov.io.ProductReader;

/**
 * @author dima
 * Шаблон билдер
 */
public class ProductFactoryBuilder {

    public static StrategyProductFactoryBuilder withReader(ProductReader reader) {
        return new StrategyProductFactoryBuilder(reader);
    }
}
