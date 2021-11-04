package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 터렛
 * 반지름이 r1인 A(x1, y1) 와 반지름이 r2인 B(x2, y2)의 접점의 개수
 * 접점이 없을 때
 * - 두 점 사이의 거리가 각 원의 반지름의 합보다 클 때 (𝑥₂ - 𝑥₁)² + (𝑦₂ - 𝑦₁)²  > (𝑟₁ + 𝑟₂)²
 * - 한 원 안에 다른 원이 있으면서 접점이 없을 때(반지름이 같지 않으면서 반지름의 차가 두 원간의 중점 거리보다 크면 된다.) (𝑥₂ - 𝑥₁)² + (𝑦₂ - 𝑦₁)²  <  (𝑟₂ - 𝑟₁)²
 * 접점이 한 개일 때
 * - 두 반지름의 차가 두 좌표간의 차랑 같으면 내접 (𝑥₂ - 𝑥₁)² + (𝑦₂ - 𝑦₁)²  =  (𝑟₂ - 𝑟₁)²
 * - 두 좌표간의 거리가 두 반지름의 합과 같으면 외접 (𝑥₂ - 𝑥₁)² + (𝑦₂ - 𝑦₁)²  =  (𝑟₂ + 𝑟₁)²
 * 접점이 두 개일 때
 * - 위 조건에 만족하지 않는다면 접점은 두 개
 */
public class Joon1002 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0){

            st = new StringTokenizer(br.readLine()," ");

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());

            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            int distance_pow = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); // 중점간 거리의 제곱
            // (x2 - x1)² + (y2 - y1)²

            if(x1 == x2 && y1 == y2 && r1 == r2){ // 중점이 같으면서 반지름도 같을 경우
                sb.append(-1).append('\n');
            }else if (distance_pow > Math.pow(r1 + r2, 2)){ // 두 원의 반지름 합보다 중점간 거리가 더 길 때
                sb.append(0).append('\n');
            }else if (distance_pow < Math.pow(r1 - r2, 2)){ // 원 안에 원이 있으나 내접하지 않을 때
                sb.append(0).append('\n');
            }else if (distance_pow == Math.pow(r1 - r2, 2)){ // 내접할 때
                sb.append(1).append('\n');
            }else if (distance_pow == Math.pow(r1 + r2, 2)){ // 외접할 때
                sb.append(1).append('\n');
            }else { // 접점이 두 개일 때
                sb.append(2).append('\n');
            }
        }
        System.out.println(sb.toString());
    }
}
