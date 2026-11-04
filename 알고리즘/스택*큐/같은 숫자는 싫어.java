// 문제 : 배열 arr가 주어졌을 때, 연속적으로 나타나는 동일한 숫자는 하나만 남기고 제거하는 문제이다. 
// 단, 중복된 숫자를 제거한 후에도 기존 배열의 원소 순서는 유지해야 한다. 
// 배열의 크기는 최대 1,000,000이므로 효율적인 탐색을 통해 연속된 숫자를 비교하고, 이전 숫자와 다른 경우에만 결과 배열에 추가하여 반환해야 한다.

// for문으로도 가능하지만 효율적인 탐색을 위해 스택을 사용하였다.
// peek()로 스택 값을 가져올때 스택이 비어있으면 오류가 발생한다는 사실을 알고 isEmpty()을 사용에 한번 추가한 후에 조건이 실행되도록 하였다.

// 코드
import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> myfirststack = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            if(myfirststack.isEmpty()){
                myfirststack.push(arr[i]);
            }else{
                if(myfirststack.peek() != arr[i]){
                    myfirststack.push(arr[i]);
                }   
            }
        }
        int[] answer = new int[myfirststack.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = myfirststack.get(i);
        }
        
        return answer;
    }
}
