package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 택시 기하학 (맨허튼 거리, Manhattan distance)
 * 두 점 T1(x1,y1), T2(x2,y2) 사이의 거리
 * D(T1,T2) = |x1-x2| + |y1-y2|
 * 유클리드 기하학 원의 넓이 : πr²
 * 택시 기하학(맨허튼 거리) 원의 넓이 : 2r²
 * 중심 점에서 반지름이라고 불리는 일정한 거리만큼 떨어져 있는 점들의 집합 (원은 정사각형이 45도 기울어진 모양)
 */
public class Joon3053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int r = Integer.parseInt(br.readLine());

        double euclid = Math.PI * r * r;
        double taxi = 2 * r * r;

        System.out.printf("%.6f\n", euclid);
        System.out.printf("%.6f", taxi);
    }
}
