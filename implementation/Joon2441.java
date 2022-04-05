package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 별 찍기 - 4
 */
public class Joon2441 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i; j++){
                sb.append("*");
            }
            sb.append("\n");
            for(int p = 0; p < i+1; p++){
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
