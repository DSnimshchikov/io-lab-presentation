package ru.onestyle.dsnimshchikov.entity.base;

import ru.onestyle.dsnimshchikov.enums.ProductCategory;

/**
 * @author dima
 * шаблон NullObject
 * шаблон синглтон
 */
public final class EmptyProduct extends Product {

    private final static EmptyProduct instance = new EmptyProduct();
    public static final double DEFAULT_COST = 0.0;
    public static final String DEFAULT_VENDOR = "Указанный продукт не найден";

    private EmptyProduct(){}

    public static EmptyProduct getInstance() {
        return instance;
    }

    @Override
    public final ProductCategory getProductCategory() {
        return ProductCategory.NULL;
    }

    @Override
    public final String vendorName() {
        return DEFAULT_VENDOR;
    }

    @Override
    public final Double getCost() {
        return DEFAULT_COST;
    }
}
