package designpattern.templatecallback;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Calculator {

    public int calcSum(String filePath) {
        BufferedReaderCallback sumCallback = br -> {
            Integer result = 0;
            String line = null;
            while ((line = br.readLine()) != null) {
                result += Integer.parseInt(line);
            }
            return result;
        };

        return fileReadTemplate(filePath, sumCallback);
    }

    public int calcMultiply(String filePath) {
        BufferedReaderCallback multiplyCallback = br -> {
            Integer result = 1;
            String line = null;
            while ((line = br.readLine()) != null) {
                result *= Integer.parseInt(line);
            }
            return result;
        };

        return fileReadTemplate(filePath, multiplyCallback);
    }

    private Integer fileReadTemplate(String filePath, BufferedReaderCallback callback) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            return callback.doSomethingWithReader(br);
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new IllegalArgumentException("Calculator Error");
    }
}
