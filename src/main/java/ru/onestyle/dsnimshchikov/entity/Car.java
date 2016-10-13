package ru.onestyle.dsnimshchikov.entity;

import lombok.Getter;
import lombok.Setter;
import ru.onestyle.dsnimshchikov.entity.base.Product;
import ru.onestyle.dsnimshchikov.enums.ProductCategory;

/**
 * @author dima
 */
@Getter
@Setter
public class Car extends Product {

    String color;
    String wheelDrive; //make enum

    private ProductCategory category = ProductCategory.CAR;

    @Override
    public ProductCategory getProductCategory() {
        return category;
    }
}
