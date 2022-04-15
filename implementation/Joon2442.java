package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 별 찍기 - 5
 */
public class Joon2442 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int idx = n - 1;

        for(int i = 1; i <= n; i++){

            for(int j = 0; j < idx; j++){ // 4, 3, 2, 1, 0
                System.out.print(" ");
            }
            for(int j = 0; j < (2 * i - 1); j++){
                System.out.print("*");
            }
            idx --;
            System.out.println(" ");
        }
    }
}
