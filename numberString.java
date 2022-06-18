import java.util.*;

public class numberString {
    public int solution(String s) {
        int answer = 0;
        HashMap map = new HashMap();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);

        Set set = map.entrySet();
        Iterator it = set.iterator();

        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            s = s.replace(e.getKey().toString(), e.getValue().toString());
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}
