package onboarding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Problem5 {
    public static List<Integer> solution(int money) {
        List<Integer> answer = new ArrayList<>(Arrays.asList(50000,10000,5000,1000,500,100,50,10,1));
        for(int i = 0; i<8 ; i++) {
        	int num = answer.get(i);
        	int value = money/num;
        	money = money % num;
        	answer.set(i, value);
        }
        answer.set(8, money);
        return answer;
    }
}
