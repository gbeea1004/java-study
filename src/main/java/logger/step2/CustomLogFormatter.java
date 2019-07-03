package logger.step2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

/*
 * 나만의 메시지로 format 하기
 */
public class CustomLogFormatter extends Formatter {

    @Override
    public String format(LogRecord record) {
        StringBuilder sb = new StringBuilder();

        sb.append(calcDate(record.getMillis()));

        sb.append(" [");
        sb.append(record.getLevel());
        sb.append("] ");

        sb.append("[");
        sb.append(record.getSourceMethodName());
        sb.append("] ");

        sb.append(record.getMessage());
        sb.append("\n");
        return sb.toString();
    }

    private String calcDate(long millis) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date(millis));
    }
}
