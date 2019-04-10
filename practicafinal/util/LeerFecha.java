package practicafinal.util;
import java.util.Date;
import java.util.Calendar;
import java.time.LocalDateTime;
import java.text.DateFormat;

public class LeerFecha
{
  public Date devolverFecha()
  {
    Calendar cal = Calendar.getInstance();
    Date fecha= cal.getTime();
    //DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    //Calendar cal = Calendar.getInstance();
    //System.out.println(dateFormat.format(cal)); //2016/11/16 12:08:43
    return fecha;
  }



}
