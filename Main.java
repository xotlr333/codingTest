import java.util.*;
import java.io.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int X = Integer.parseInt(sc.next());
        int Y = Integer.parseInt(sc.next());
        int beforeResult = (int)(((double)Y/X)*100);
        int afterResult = beforeResult;
        int cnt = 0;

        if(X == Y){
            cnt = -1;
        } else {
            while(afterResult == beforeResult){
                X++;
                Y++;
                afterResult = (int)(((double)Y/X)*100);
                cnt++;
            }
        }

        System.out.print(cnt);

    }

}
