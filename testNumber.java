import java.util.ArrayList;
import java.util.List;

public class testNumber {
    public int[] solution(int[] answers) {
        int[] result = {0, 0, 0};
        int[] list_a = {1, 2, 3, 4, 5}; // 5
        int[] list_b = {2, 1, 2, 3, 2, 4, 2, 5}; // 8
        int[] list_c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; // 10

        for (int i = 0; i < answers.length; i++) {
            result[0] = (answers[i] == list_a[i%5]) ? result[0] + 1 : result[0];
            result[1] = (answers[i] == list_b[i%8]) ? result[1] + 1 : result[1];
            result[2] = (answers[i] == list_c[i%10]) ? result[2] + 1 : result[2];
        }

        int max = 0;
        for (int i = 0; i < result.length; i++) {
            max = (max < result[i]) ? result[i] : max;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (max == result[i])
                list.add(i+1);
        }

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
