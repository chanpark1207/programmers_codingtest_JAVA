// 문제 : 정수리스트를 오름차순으로 정리후 앞에 5개만 출력



// Arrays.sort(배열) - 오름차순으로 정리됨 (ArrayList도 가능)


//코드
import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        Arrays.sort(num_list);
        for(int i = 0; i < answer.length; i++){
            answer[i] = num_list[i];
        }
        return answer;
    }
}
