package estudos.maratonajava.javacore.formatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeJapao = new Locale("ja", "JP");
        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        System.out.println("Italy: " + df1.format(calendar.getTime()));
        System.out.println("Japao: " + df2.format(calendar.getTime()));

        System.out.println(localeJapao.getDisplayCountry());


    }
}
