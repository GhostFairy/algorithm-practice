import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 5554. 심부름 가는 길
public class Baekjoon5554 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = 0;
        for (int i = 0; i < 4; i++) {
            input += Integer.parseInt(br.readLine());
        }
        System.out.println(input / 60);
        System.out.println(input % 60);
    }

}
