package ifmun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 주사위 세개
 */
public class Joon2480 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int one = Integer.parseInt(st.nextToken());
        int two = Integer.parseInt(st.nextToken());
        int three = Integer.parseInt(st.nextToken());

        int result = 0;

        if(one == two && two == three){
            result = 10000 + one * 1000;
        }
        else if(one == two || one == three){
            result = 1000 + one * 100;
        }
        else if(two == three){
            result = 1000 + three * 100;
        }else {
            result = Math.max(Math.max(one, two), three) * 100;
        }
        System.out.print(result);
    }
}
