import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 18108. 1998년생인 내가 태국에서는 2541년생?!
public class Baekjoon18108 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(Integer.parseInt(br.readLine()) - 543);
    }

}