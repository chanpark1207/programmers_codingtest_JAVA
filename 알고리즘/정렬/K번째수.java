// 문제 : 배열을 i부터j번째까지 자르고 정렬했을때, k번째 있는수를 구하기

// ArrayList를 정렬할때는 Collections.sort(배열이름); 사용하기

// 코드
import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> value = new ArrayList<>();
        for(int i = 0 ; i < commands.length; i++){
            ArrayList<Integer> cash = new ArrayList<>();
            for(int j = commands[i][0]; j < commands[i][1]; j++){
                cash.add(array[j]);
            }
            Collections.sort(cash);
            value.add(cash.get(commands[i][2] - 1));
        }
        
        int[] answer = {};
        
        return answer;
    }
}
