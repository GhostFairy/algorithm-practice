// 1152. 단어의 개수 (trim() 사용)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1152_rework {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        String[] words = br.readLine().trim().split(" ");

        for(int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
