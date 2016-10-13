package ru.onestyle.dsnimshchikov.entity;

import ru.onestyle.dsnimshchikov.entity.base.Product;
import ru.onestyle.dsnimshchikov.enums.ProductCategory;

/**
 * @author dima
 */
public class Ball extends Product {
    private ProductCategory category = ProductCategory.BALL;

    @Override
    public ProductCategory getProductCategory() {
        return category;
    }


}
