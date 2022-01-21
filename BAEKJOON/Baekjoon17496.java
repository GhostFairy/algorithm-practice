// 17496. 스타후르츠

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon17496 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]); // 여름의 일 수
        int T = Integer.parseInt(input[1]); // 스타후르츠가 자라는데 걸리는 일 수
        int C = Integer.parseInt(input[2]); // 스타후르츠를 심을 수 있는 칸의 수
        int P = Integer.parseInt(input[3]); // 스타후르츠 개당 가격

        // 여름의 마지막 날 하루 전까지 성장을 마친 작물만 수확 가능
        System.out.println((N - 1) / T * C * P);
    }

}
