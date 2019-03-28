package etc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class nextMonth25 {
    // yyyyMM 형식의 String 날짜 다음달 25일로 바꾸기 (java)
    public static void main(String[] args) {
        try {
        String to = "201914";

        SimpleDateFormat transFormat = new SimpleDateFormat("yyyyMM");
        SimpleDateFormat transFormat2 = new SimpleDateFormat("yyyyMMdd");

        Date date = transFormat.parse(to);
        Calendar cal = Calendar.getInstance();
        
        cal.setTime(date);
        cal.add(Calendar.MONTH, 1);
        cal.add(Calendar.DATE, 24);
        
        System.out.println(transFormat2.format(cal.getTime()));
        
        //System.out.println();
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
