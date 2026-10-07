// 문제 : 정수 리스트에서 가장 작은 5개의 수를 제외한 수를 오름차순으로 담은 리스트 출력


// 코드
import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length-5];
        Arrays.sort(num_list);
        int q = 5;
        for(int i = 0; i < answer.length; i++){
            answer[i] = num_list[q];
            q++;
        }
        return answer;
    }
}
