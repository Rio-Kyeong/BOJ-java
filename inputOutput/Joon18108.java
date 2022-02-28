package inputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1998년생인 내가 태국에서는 2541년생?!
 */
public class Joon18108 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int y = Integer.parseInt(br.readLine());
        int seogi = 543;

        if(!(1000 <= y && y <= 3000)){
            while (true){
                System.out.println("불기 연도를 다시 입력해주세요. (1000 <= y <= 3000)");
                y = Integer.parseInt(br.readLine());
                if(1000 <= y && y <= 3000){
                    System.out.print(y - seogi);
                    break;
                }
            }
        }else {
            System.out.print(y - seogi);
        }
    }
}
