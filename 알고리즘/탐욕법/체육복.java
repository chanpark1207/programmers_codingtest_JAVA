// 문제 : 일부 학생이 체육복을 도난당했으며, 여벌 체육복을 가진 학생은 앞번호 또는 뒷번호 학생에게 체육복을 빌려줄 수 있다. 체육복을 도난당했지만 여벌이 있는 학생은 본인이 사용해야 한다.
// 주어진 조건에서 체육 수업에 참여할 수 있는 학생의 최댓값을 구하는 문제이다.

// 레벨1 문제였지만 상당히 오래걸렸다...
// 단순 이중 for문으로 처음에는 앞번호 뒷번호에게 빌려주는 방식으로 구현했다.
// 그러나 도난을 당했는데 여벌이 있는 말도안되는 학생도 존재할수 있다는걸 알고 수정했다.
// 그리고 배열이 항상 정렬이 되어있지 않는다는 점도 확인하여 수정하였다.

// 중첩for문을 두번이나 사용했는데 빌려주고 하는 과정에서 for문을 하나 줄일수 있을것 같다. 어차피 +- 1에서만 확인하기 때문이다. 

// 코드
import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        for(int i = 0; i < lost.length; i++){
            for(int j = 0; j < reserve.length; j++){
                if(lost[i] == reserve[j]){
                    reserve[j] = -3;
                    lost[i] = -1;
                    answer++;
                }
            }
        }
        for(int i = 0; i < lost.length; i++){
            for(int j = 0; j < reserve.length; j++){
                if(lost[i] == reserve[j] + 1){
                    reserve[j] = -3;
                    lost[i] = -1;
                    answer++;
                }else if(lost[i] == reserve[j] - 1){
                    reserve[j] = -3;
                    lost[i] = -1;
                    answer++;
                }   
            }
        }
        return answer;
    }
}
