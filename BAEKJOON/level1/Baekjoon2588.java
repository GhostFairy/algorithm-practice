package level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2588. 곱셈
public class Baekjoon2588 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        System.out.println(a * (b % 10));
        System.out.println(a * ((b / 10) % 10));
        System.out.println(a * ((b / 100) % 10));
        System.out.println(a * b);
    }

}