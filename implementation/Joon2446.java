package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 별 찍기 - 9
 */
public class Joon2446 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int star = 2 * n - 1;
        int star2 = 3;

        for(int i = 0; i < n; i++){ // 0, 1, 2, 3, 4
            for(int j = 0; j < i; j++){ // 0, 1, 2,3,4
                System.out.print(" ");
            }
            for(int j = 0; j < star; j++){ // 9, 7, 5, 3, 1
                System.out.print("*");
            }
            System.out.println();
            star-=2;
        }

        for(int i = n ; i > 1; i--){ // 4, 3, 2, 1
            for(int j = i - 2; j >= 1; j--){ //4, 3, 2, 1
                System.out.print(" ");
            }
            for(int j = 0; j < star2; j++){ // 3, 5, 7, 9
                System.out.print("*");
            }
            System.out.println();
            star2+=2;
        }
    }
}
