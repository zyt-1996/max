import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDate {

    public static void main(String[] args) throws ParseException {

        Date date = new Date();
        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        //计算几天后的时间, 2是int类型，表示增加的天数；
        calendar.add(Calendar.DATE, 2);
        System.out.println(calendar.getTime());

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(df.format(calendar.getTime()));
        System.out.println(df.parse("2022-08-01"));

    }
}
