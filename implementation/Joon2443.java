package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Joon2443 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int star = 2 * n - 1;

        for(int i = 0; i < n; i++){
           for(int k = 0; k < i; k++){
               System.out.print(" ");
           }
           for(int j = 1; j <= star; j++){
               System.out.print("*");
           }
            System.out.print("\n");
            star-=2;
        }
    }
}
