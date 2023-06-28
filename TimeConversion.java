import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.*;
public class TimeConversion {
    private static final String Date = null;

    public static void main(String[] args) {
       //String[] ids TimeZone.getAvailableIDs(0);
       String formate="dd-M-yyyy hh:mm:ss a";
       SimpleDateFormat dateFormat=new SimpleDateFormat(formate);

       Date dt=new Date();
       String deafultTZ=TimeZone.getDefault().getID();
       System.out.println(deafultTZ);

       GregorianCalendar cal=new GregorianCalendar();
       cal.setTime(dt);

       DateFormat dateFormate;
       System.out.println("Date:" + dateFormat.format(cal.getTime()));
       System.out.println("TimeZone:"+cal.getTimeZone().getID());
       System.out.println("TimeZone Name:"+cal.getTimeZone().getDisplayName());
     
    
       TimeZone jnbTZ=TimeZone.getTimeZone("Africa/Johannesburg");
       //String format;
       SimpleDateFormat jnbFormat=new SimpleDateFormat(formate);
       jnbFormat.setTimeZone(jnbTZ);

       cal.setTimeZone(jnbTZ);
       System.out.println("AfterConversion:");
       System.out.println("Date:" + jnbFormat.format(cal.getTime()));
       System.out.println("TimeZone:"+cal.getTimeZone().getID());
       System.out.println("TimeZone Name:"+cal.getTimeZone().getDisplayName());
    }

    

    
}
