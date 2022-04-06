package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 그대로 출력하기
 */
public class Joon11718 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true){
            String str = br.readLine();
            if(str == null || str.isEmpty()){
                break;
            }
            sb.append(str).append("\n");
        }
        System.out.print(sb.toString());
    }
}
