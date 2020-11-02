import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;



public class Main
{
    public static void main(String[] args)
    {
        int a = 1;
        int b = a++;
        System.out.println(b);
        //System.out.println("Hello World");
        DateFormat format = new SimpleDateFormat("HH:mm dd.MM.yyyy");
        Date date = new Date();
        System.out.println(format.format(date));
    }

}
