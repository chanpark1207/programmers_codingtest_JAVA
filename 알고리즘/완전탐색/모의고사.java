// 문제 : 각 수포자의 반복되는 답안 패턴을 이용해 정답 개수를 계산하고, 가장 많은 문제를 맞힌 수포자의 번호를 반환하는 문제입니다.
// 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
// 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
// 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ..

// 처음에는 count라는 변수를 이용해 여러조건에 따라 변화하며 정답을 구하려고 했으나 2번 3번이 계속 오류 발생
// 결국 정답안은 배열로 만들어서 풀이함
// 1번 수포자의 찍는 방식도 배열로 만들어서 했어도 됬을것 같음

// 코드
import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> al = new ArrayList<>();
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int supoja1 = 0;
        int supoja2 = 0;
        int supoja3 = 0;
        int count = 0;
        for(int i = 0; i < answers.length; i++){
            count++;
            if(count > 5){
                count = 1;
            }
            if(count == answers[i]){
                supoja1++;
            }
        }
        
        for(int i = 0; i < answers.length; i++){
            if(supo2[i%8] == answers[i]){
                supoja2++;
            }
        }
        
        for(int i = 0; i < answers.length; i++){
            if(i%2 == 0){
                count = supo3[i%10];
            }
            if(count == answers[i]){
                supoja3++;
            }
        }
        
        int max = Math.max(supoja1, Math.max(supoja2, supoja3));

        if(supoja1 == max) al.add(1);
        if(supoja2 == max) al.add(2);
        if(supoja3 == max) al.add(3);
        
        
        int[] answer = new int[al.size()];
        for(int i = 0; i < al.size(); i++){
            answer[i] = al.get(i);
        }
        return answer;
    }
    }
