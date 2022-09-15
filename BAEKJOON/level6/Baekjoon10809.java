package level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 10809. 알파벳 찾기
public class Baekjoon10809 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        for (char i = 'a'; i <= 'z'; i++) {
            int index = -1;

            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == i) {
                    index = j;
                    break;
                }
            }

            System.out.print(index + " ");
        }

        System.out.println();
    }

}
