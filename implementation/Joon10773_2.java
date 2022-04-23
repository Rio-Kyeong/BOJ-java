package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 제로
 */
public class Joon10773_2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());
        int sum = 0;

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < k; i++){
            int money = Integer.parseInt(br.readLine());
            if(money == 0){
                stack.pop();
            }else {
                stack.push(money);
            }
        }

        for (Integer idx : stack) {
            sum += idx;
        }
        System.out.print(sum);
    }
}
