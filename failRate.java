import java.util.*;

public class failRate {

    static class Stage {
        int level;
        double stay;
        int passOrStay;

        public Stage(int level, double stay, int passOrStay) {
            this.level = level;
            this.stay = stay;
            this.passOrStay = passOrStay;
        }

        double rate() {
            return (this.stay / this.passOrStay);
        }
    }

    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        ArrayList<Stage> arr = new ArrayList<>();

        for (int i = 0; i < N; i++) { // initialize
            Stage stage = new Stage(i+1,0,0);
            arr.add(stage);
        }

        for (int stage : stages) { // not yet, stay stage...
            if (stage <= N) {
                arr.get(stage - 1).passOrStay += 1;
                arr.get(stage - 1).stay += 1;
                for (int i = 0; i < stage - 1; i++) { // clear!!!
                    arr.get(i).passOrStay += 1;
                }
            } else if (stage == N) {
                for (int i = 0; i < stage - 1; i++) { // clear!!!
                    arr.get(i).passOrStay += 1;
                }
            }
        }
        
        //Collections.sort(arr, ((o1, o2) -> Double.compare(o1.rate(), o2.rate())));

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).level + " " + arr.get(i).stay + " " + arr.get(i).passOrStay);
            System.out.println();
        }

        return answer;
    }
}
