import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 15964. 이상한 기호
public class Baekjoon15964 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);

        System.out.println((long) (A + B) * (A - B));
    }

}
