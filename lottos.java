public class lottos {
    static public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0,0};
        int hit = 0, unknown = 0, high, low;

        for (int i = 0; i < lottos.length; i++){
            int num = lottos[i];
            if (num == 0) {
                unknown += 1;
            }
            for (int j = 0; j < win_nums.length; j++) {
                if (win_nums[j] == num)
                    hit += 1;
            }
        }

        answer[0] = ((hit+unknown) < 2 ? 6 : (7 - (hit+unknown)));
        answer[1] = (hit < 2 ? 6 : (7 - hit));
        return answer;
    }

    public static void main(String[] args) {
        int[] lottos = {31, 10, 0, 0, 6, 19};
        int[] wins = {31, 10, 45, 1, 6, 19};
        int[] result = solution(lottos, wins);
        System.out.println(result[0] + " " + result[1]);
    }
}
