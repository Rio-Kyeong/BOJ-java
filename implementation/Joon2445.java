package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 별 찍기 - 8
 */
public class Joon2445 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){ // 1, 2, 3, 4, 5
                System.out.print("*");
            }
            for(int j = 1; j <= (2 * n) - (i * 2); j++){ // 8, 6, 4, 2, 0
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){ // 1, 2, 3, 4, 5
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = (n - 1); i > 0; i--){
            for(int j = i;  j >= 1; j--){ // 4, 3, 2, 1
                System.out.print("*");
            }
            for(int j = (2 * n) - (i * 2); j >= 1; j--){ // 2, 4, 6, 8
                System.out.print(" ");
            }
            for(int j = i;  j >= 1; j--){ // 4, 3, 2, 1
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
