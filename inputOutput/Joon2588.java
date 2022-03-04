package inputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 곱셈
 */
public class Joon2588 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i = Integer.parseInt(br.readLine());
        String j = br.readLine();

        int three = i * Integer.parseInt(String.valueOf(j.charAt(2)));
        int four = i * Integer.parseInt(String.valueOf(j.charAt(1)));
        int five = i * Integer.parseInt(String.valueOf(j.charAt(0)));
        int six = (five * 100) + (four * 10) + three;

        System.out.print(three + "\n" + four + "\n" + five + "\n" + six);
    }
}
