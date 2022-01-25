// 2954. 창영이의 일기장

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2954 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        for(int i = 0; i < input.length; i++) {
            input[i] = input[i].replaceAll("([aeiou])p\\1", "$1");
            System.out.println(input[i]);
        }
    }

}
