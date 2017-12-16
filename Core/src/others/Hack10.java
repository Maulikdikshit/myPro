package others;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Hack10 {
    public static String getDay(String day, String month, String year) throws ParseException
    {
        /*
        * Write your code here.
        */
        
        String d= day+"/"+month+"/"+year;
       SimpleDateFormat format=new SimpleDateFormat("dd/mm/yyyy");
	        Date d1 = null;
	        String dayOfWeek = null;
	        //Date d2;	       
			 d1=format.parse(d);
			 dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(d1);
        
        return dayOfWeek;
        
    }   
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
    }
}