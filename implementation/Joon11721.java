package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 열 개씩 끊어 출력하기
 */
public class Joon11721 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String n = br.readLine();

        int length = n.length() - (n.length() % 10);

        for(int i = 0; i <= length; i+=10){
            if(i == length){
                sb.append(n.substring(i));
                break;
            }
            sb.append(n.substring(i, i+10)).append("\n");
        }
        System.out.print(sb.toString());
    }
}
