// 1152. 단어의 개수 (trim() 사용)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1152_another {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(bf.readLine().trim().split(" ").length);
    }
}