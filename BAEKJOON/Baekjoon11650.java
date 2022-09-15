import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

// 11650. 좌표 정렬하기
public class Baekjoon11650 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.parseInt(br.readLine());
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (int i = 0; i < max; i++) {
            String[] coord = br.readLine().split(" ");

            if (!map.containsKey(coord[0])) {
                map.put(coord[0], new ArrayList<>());
            }
            // x좌표가 같은 점들을 하나의 ArrayList에 저장
            map.get(coord[0]).add(coord[1]);
        }
        
        // x좌표 순으로 정렬
        Object[] arr = map.keySet().toArray();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            // 각 x좌표 ArrayList를 y좌표 순으로 정렬
            map.get((String) arr[i]).sort(null);
            for (int j = 0; j < map.get((String) arr[i]).size(); j++) {
                System.out.println((String) arr[i] + " " + map.get((String) arr[i]).get(j));
            }
        }
    }

}