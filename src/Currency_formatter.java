        import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

        import static java.lang.Math.pow;

        public class Currency_formatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();


            //    Locale currentlocationu = Locale.US;
            Locale currentlocationi = new Locale("en", "IN");
            // Locale currentlocationc = Locale.CHINA;
            //Locale currentlocationf = Locale.FRANCE;


            NumberFormat nfu = NumberFormat.getCurrencyInstance(Locale.US);
            NumberFormat nfi = NumberFormat.getCurrencyInstance(currentlocationi);
            NumberFormat nfc = NumberFormat.getCurrencyInstance(Locale.CHINA);
            NumberFormat nff = NumberFormat.getCurrencyInstance(Locale.FRANCE);
            System.out.println(nfu);
            System.out.println("US: " + nfu.format(payment));
            System.out.println("India: " + nfi.format(payment));
            System.out.println("China: " + nfc.format(payment));
            System.out.println("France: " + nff.format(payment));
        }
    }
