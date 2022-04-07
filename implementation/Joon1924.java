package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 2007년
 */
public class Joon1924 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        String[] day = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int index = 0;

        for(int i = 0; i < x - 1; i++){
            index += month[i];
        }

        index += y - 1;

        System.out.print(day[index % 7]);
    }
}
