import java.util.*;
import java.io.*;
import java.util.regex.Pattern;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int T = Integer.parseInt(sc.next());

        for (int i = 0; i < T; i++) {
            String str = sc.next();
            String pattern = "(100+1+|01)+";

            boolean result = Pattern.matches(pattern, str);
            System.out.println(result ? "YES" : "NO");
        }


    }

}
