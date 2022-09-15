// 2953. 나는 요리사다

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2953 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] score = new int[5];
        for (int i = 0; i < score.length; i++) {
            String[] temp = br.readLine().split(" ");
            for (int j = 0; j < temp.length; j++) {
                score[i] += Integer.parseInt(temp[j]);
            }
        }

        int topCook = 0;

        for (int i = 1; i < score.length; i++) {

            if (score[i] > score[topCook]) {
                topCook = i;
            }
        }

        System.out.println((topCook + 1) + " " + score[topCook]);
    }

}