import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// 1271. 엄청난 부자2
public class Baekjoon1271 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        BigInteger A = new BigInteger(input[0]);
        BigInteger B = new BigInteger(input[1]);

        System.out.println(A.divide(B));
        System.out.println(A.remainder(B));
    }

}
