
import java.util.Scanner;
class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "^[[a-z]|[A-Z]][\\d|[_]|[a-z]|[A-Z]]{7,29}$";
}


public class Regular_Expression2 {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());

          while(n--!=0) {
              String userName = scan.nextLine();
              if (userName.matches(UsernameValidator.regularExpression)) {
                  System.out.println("Valid");
              } else {
                  System.out.println("Invalid");
              }
          }

    }
}