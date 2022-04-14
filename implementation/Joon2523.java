package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 별 찍기 - 13
 */
public class Joon2523 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) { // 0, 1, 2
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println(" ");
        }

        for(int i = (2 * n - 1); i > n; i--){ // 5, 4
            for(int j = i - n; j > 0; j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
