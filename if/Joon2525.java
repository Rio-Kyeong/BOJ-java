package ifmun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 오븐 시계
 */
public class Joon2525 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        int time = Integer.parseInt(br.readLine());

        int inputMinute = minute + time;

        if (inputMinute >= 60) {
            hour = hour + inputMinute/60;
            minute = inputMinute%60;
            if (hour >= 24) {
                hour -= 24;
            }
            System.out.print(hour + " " + minute);
        }else {
            System.out.print(hour + " " + inputMinute);
        }
    }
}
