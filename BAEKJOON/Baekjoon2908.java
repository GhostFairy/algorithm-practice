// 2908. 상수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2908 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int[] output = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            output[i] = Integer.parseInt(new StringBuilder(input[i]).reverse().toString());
        }

        System.out.println(output[0] > output[1] ? output[0] : output[1]);
    }

}
