package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 음계
 */
public class Joon2920_2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] ascending = {1,2,3,4,5,6,7,8};
        int[] descending = {8,7,6,5,4,3,2,1};

        int[] input = new int[8];

        for(int i = 0; i < input.length; i++){
            input[i] = Integer.parseInt(st.nextToken());
        }

        if(Arrays.equals(input, ascending)){
            System.out.print("ascending");
        }else if(Arrays.equals(input, descending)){
            System.out.print("descending");
        }else {
            System.out.print("mixed");
        }
    }
}
