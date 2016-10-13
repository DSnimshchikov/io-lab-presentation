package ru.onestyle.dsnimshchikov.entity.base;

import ru.onestyle.dsnimshchikov.enums.ProductCategory;

/**
 * @author dima
 */
public abstract class Product {

    private String vendorName;
    private Double cost;

    public abstract ProductCategory getProductCategory();

    public String vendorName() {
        return vendorName;
    }

    public Double getCost() {
        return cost;
    }
}
