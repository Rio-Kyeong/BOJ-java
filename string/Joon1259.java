package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 팰린드롬수
 */
public class Joon1259 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        while (true){
            String s = br.readLine();
            String reversed = new StringBuilder(s).reverse().toString();

            if(s.equals("0")){
                break;
            }

            if(s.equals(reversed)){
                sb.append("yes").append("\n");
            }else{
                sb.append("no").append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
