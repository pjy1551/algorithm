package backjoon;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Backjoon1924 {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            String year = "2007";
            String month = String.format("%02d", sc.nextInt());
            String day = String.format("%02d", sc.nextInt());

            String stringDate = year + month + day;
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
            Date date = dateFormat.parse(stringDate);
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);

            int dayNum = cal.get(Calendar.DAY_OF_WEEK);

            switch (dayNum) {
            case 1:
                day = "SUN";
                break;
            case 2:
                day = "MON";
                break;
            case 3:
                day = "TUE";
                break;
            case 4:
                day = "WED";
                break;
            case 5:
                day = "THU";
                break;
            case 6:
                day = "FRI";
                break;
            case 7:
                day = "SAT";
                break;
            }
            
            System.out.println(day);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
