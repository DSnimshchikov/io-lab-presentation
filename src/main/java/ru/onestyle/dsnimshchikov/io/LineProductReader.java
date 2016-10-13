package ru.onestyle.dsnimshchikov.io;

import ru.onestyle.dsnimshchikov.entity.Ball;
import ru.onestyle.dsnimshchikov.entity.base.EmptyProduct;
import ru.onestyle.dsnimshchikov.entity.base.Product;

/**
 * @author dima
 */
public abstract class LineProductReader implements ProductReader {

    public Product read(String product) {
        if (product == null || product.isEmpty()) {
            return EmptyProduct.getInstance();
        }
        return new Ball(); //fixme надо сдлеать реальное чтение
    }
}
