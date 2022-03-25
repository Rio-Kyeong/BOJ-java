package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 검증수
 */
public class Joon2475_2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] number = br.readLine().split(" ");

        int verifications = 0;

        for(int i = 0; i < number.length; i++){
            verifications += Integer.parseInt(number[i]) * Integer.parseInt(number[i]);
        }

        System.out.print(verifications % 10);
    }
}
