import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class Baekjoon9375 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int testCase = Integer.parseInt(br.readLine());

            for (int i = 0; i < testCase; i++) {
                int input = Integer.parseInt(br.readLine());
                // 각 부위마다 HashSet을 두고 그 안에 옷의 종류를 저장한다
                HashMap<String, HashSet<String>> map = new HashMap<>();

                for (int j = 0; j < input; j++) {
                    String[] cloth = br.readLine().split(" ");

                    // 해당 부위가 처음 등장했다면 새 HashSet을 만든다
                    if (!map.containsKey(cloth[1])) {
                        map.put(cloth[1], new HashSet<>());
                    }
                    // 해당 부위의 HashSet에 옷의 종류를 저장한다
                    map.get(cloth[1]).add(cloth[0]);
                }

                int combi = 1;
                for (String str : map.keySet()) {
                    // 경우의 수를 계산하기 위해 부위별로 가진 옷의 수를 곱해준다
                    combi *= map.get(str).size() + 1; // 해당 부위를 입지 않는 경우를 포함하기 위해 + 1
                }

                // 결과 출력
                System.out.println(combi - 1); // 모든 부위를 입지 않은 경우를 제외하기 위해 - 1
            }
        } catch (IOException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("잘못 입력하셨습니다.");
        }
    }

}
