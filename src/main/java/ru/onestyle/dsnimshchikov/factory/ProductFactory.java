package ru.onestyle.dsnimshchikov.factory;

import com.google.common.reflect.ClassPath;
import ru.onestyle.dsnimshchikov.entity.base.Product;
import ru.onestyle.dsnimshchikov.io.ProductReader;

import java.io.IOException;
import java.util.Set;

/**
 * @author dima
 * шаблон фабрика
 */
public class ProductFactory {

    Set<ClassPath.ClassInfo> classes;
    ProductReader reader;
    private String packageName;

    ProductFactory() throws IOException {
        final ClassLoader loader = Thread.currentThread().getContextClassLoader();
        ClassPath classpath = ClassPath.from(loader);
        classes = classpath.getTopLevelClasses(packageName);
    }

    ProductFactory setReader(ProductReader reader) {
        this.reader = reader;
        return this;
    }

    public Product readProduct() {
        return reader.read();
    }

    ProductFactory setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }
}
