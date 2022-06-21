public class ExerciseCloths {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        for (int loster : lost) {
            for (int i = 0; i < reserve.length; i++) {
                if ((loster - 1) == reserve[i] || (loster + 1) == reserve[i]) {
                    reserve[i] = 0;
                    answer += 1;
                    break;
                }
            }
        }

        return answer;
    }
}
