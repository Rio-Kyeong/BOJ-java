package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 음계
 */
public class Joon2920 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[8];

        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        String result = "";
        for(int i = 1; i <= arr.length - 1; i++){
            if(arr[i - 1]  + 1 == arr[i]){
                result = "ascending";
            }else if(arr[i - 1]  - 1 == arr[i]){
                result = "descending";
            }else {
                result = "mixed";
                break;
            }
        }
        System.out.print(result);
    }
}
