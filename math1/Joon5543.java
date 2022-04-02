package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 상근날드
 */
public class Joon5543 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] ary = new int[5];

        for(int i = 0; i < 5; i++){
            ary[i] = Integer.parseInt(br.readLine());
        }

        int bugger = Math.min(Math.min(ary[0], ary[1]), ary[2]);
        int drink = Math.min(ary[3], ary[4]);

        System.out.print((bugger + drink) - 50);
    }
}
