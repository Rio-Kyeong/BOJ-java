package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 검증수
 */
public class Joon2475 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int pow = (int) ((Math.pow(Integer.parseInt(st.nextToken()), 2)
                                + Math.pow(Integer.parseInt(st.nextToken()), 2)
                                + Math.pow(Integer.parseInt(st.nextToken()), 2)
                                + Math.pow(Integer.parseInt(st.nextToken()), 2)
                                + Math.pow(Integer.parseInt(st.nextToken()), 2)) % 10);

        System.out.print(pow);
    }
}
