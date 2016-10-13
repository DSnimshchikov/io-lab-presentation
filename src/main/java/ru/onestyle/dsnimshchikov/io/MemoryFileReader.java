package ru.onestyle.dsnimshchikov.io;

import ru.onestyle.dsnimshchikov.entity.base.Product;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author dima
 * Применение шаблона декоратор
 */
public class MemoryFileReader extends LineProductReader {

    private List<String> lines;

    public MemoryFileReader(ProductFileReader fileReader) throws IOException {
        lines = Files.readAllLines(Paths.get(fileReader.fileName));
    }

    @Override
    public Product read() {
        String productDefinitions = null;
        if (lines.size() > 0 ) {
            productDefinitions = lines.remove(0);
        }
        return read(productDefinitions);
    }

}
