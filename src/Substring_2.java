
    import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

    public class Substring_2 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String S = in.next();
            int start = in.nextInt();
            int end = in.nextInt();
            System.out.println(S.substring(start,end));
        }
}
/* output
jillasangeetha
3 8
lasan
 */