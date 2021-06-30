package designpattern.templatecallback;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Calculator {

    public int calcSum(String filePath) {
        BufferedReaderCallback sumCallback = new BufferedReaderCallback() {
            @Override
            public Integer doSomethingWithReader(BufferedReader br) throws IOException {
                Integer result = 0;
                String line = null;
                while ((line = br.readLine()) != null) {
                    result += Integer.valueOf(line);
                }
                return result;
            }
        };

        return fileReadTemplate(filePath, sumCallback);
    }

    public int calcMultiply(String filePath) {
        BufferedReaderCallback multiplyCallback = new BufferedReaderCallback() {
            @Override
            public Integer doSomethingWithReader(BufferedReader br) throws IOException {
                Integer result = 1;
                String line = null;
                while ((line = br.readLine()) != null) {
                    result *= Integer.valueOf(line);
                }
                return result;
            }
        };

        return fileReadTemplate(filePath, multiplyCallback);
    }

    private Integer fileReadTemplate(String filePath, BufferedReaderCallback callback) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filePath));
            return callback.doSomethingWithReader(br);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return 0;
    }
}
