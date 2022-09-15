package level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2562. 최댓값
public class Baekjoon2562 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = 0;
        int order = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                order = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(order);
    }

}
