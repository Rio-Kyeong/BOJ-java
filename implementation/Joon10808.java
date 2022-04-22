package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 알파벳 개수
 */
public class Joon10808 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] count = new int[26];

        String s = br.readLine();

        for(int i = 0; i < s.length(); i++){
            count[(int) s.charAt(i) - 97] += 1;
        }

        for (int i : count) {
            System.out.print(i + " ");
        }
    }
}
