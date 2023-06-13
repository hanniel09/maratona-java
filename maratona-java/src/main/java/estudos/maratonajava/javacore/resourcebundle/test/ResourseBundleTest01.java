package estudos.maratonajava.javacore.resourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourseBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        ResourceBundle bundleBr = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        System.out.println(bundleBr.getString("hello"));
        System.out.println(bundleBr.getString("good.morning"));

        System.out.println(bundle.getString("hi"));
        System.out.println(bundleBr.getString("hi"));

    }
}

