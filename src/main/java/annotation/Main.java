package annotation;

@DateTime(yymmdd = "190416", hhmmss = "225101")
public class Main {
    public static void main(String[] args) {
        Class<Main> dateTimeClass = Main.class;
        DateTime dateTime = (DateTime) dateTimeClass.getAnnotation(DateTime.class);
        System.out.println("날짜 : " + dateTime.yymmdd());
        System.out.println("시간 : " + dateTime.hhmmss());
    }
}
