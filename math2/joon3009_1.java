package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 네 번째 점
 * List 이용하기
 */
public class joon3009_1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        List<Integer> arrayX = new ArrayList<>(3);
        List<Integer> arrayY = new ArrayList<>(3);

        int x, y;

        for(int i = 0; i < 3; i++){
            arrayX.add(Integer.parseInt(st.nextToken()));
            arrayY.add(Integer.parseInt(st.nextToken()));

            if(i == 0 || i == 1){
                st = new StringTokenizer(br.readLine(), " ");
            }
        }

        if(arrayX.get(0).equals(arrayX.get(1))){
            x = arrayX.get(2);
        }else if(arrayX.get(0).equals(arrayX.get(2))){
            x = arrayX.get(1);
        }else {
            x = arrayX.get(0);
        }

        if(arrayY.get(0).equals(arrayY.get(1))){
            y = arrayY.get(2);
        }else if(arrayY.get(0).equals(arrayY.get(2))){
            y = arrayY.get(1);
        }else {
            y = arrayY.get(0);
        }

        System.out.println(x+" "+y);
    }
}
