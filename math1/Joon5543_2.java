package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 상근날드
 */
public class Joon5543_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int bugger = 2001;
        int drink = 2001;

        for(int i = 0; i < 3; i++){
            int value = Integer.parseInt(br.readLine());
            if(value < bugger){
                bugger = value;
            }
        }

        for(int i = 0; i < 2; i++){
            int value = Integer.parseInt(br.readLine());
            if(value < drink){
                drink = value;
            }
        }
        System.out.print((bugger + drink) - 50);
    }
}
