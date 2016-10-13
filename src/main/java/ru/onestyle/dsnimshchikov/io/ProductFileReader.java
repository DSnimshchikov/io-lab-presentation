package ru.onestyle.dsnimshchikov.io;

import lombok.extern.slf4j.Slf4j;
import ru.onestyle.dsnimshchikov.entity.base.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author dima
 */
@Slf4j
public class ProductFileReader extends LineProductReader {

    protected String fileName;
    BufferedReader reader;

    public ProductFileReader(String fileName) throws IOException {
        this.fileName = fileName;
        reader = new BufferedReader(new FileReader(fileName));
    }

    @Override
    public Product read() {
        String s = null;
        try {
            s = reader.readLine();
        } catch (IOException e) {
            log.error("not reader line from file", e);
        }
        return read(s);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
