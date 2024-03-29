import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1152. 단어의 개수
public class Baekjoon1152 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int count = 0;

        for (String str : input) {
            if (str.length() > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
