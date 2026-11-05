// 문제 : 여러 기능의 개발 진도와 하루 작업 속도가 주어졌을 때,
// 각 기능이 100% 완료되기까지 필요한 일수를 계산하고 배포 순서에 따라 함께 배포되는 기능의 개수를 구하는 문제이다. 
// 뒤에 있는 기능이 먼저 완성되더라도 앞선 기능이 완료될 때까지 기다려야 하며, 
// 앞선 기능이 배포되는 날 이미 완성된 기능들은 함께 배포된다.
// 예를 들어 개발 완료까지 각각 7일, 3일, 9일이 걸린다면 첫 번째와 두 번째 기능은 7일째 함께 배포되고, 세 번째 기능은 9일째 배포되어 [2, 1]을 반환한다.

// 문제 풀이 과정 및 느낀 점

// 각 기능의 개발 완료 일수를 계산할 때 무조건 올림 처리가 필요했다. 처음에는 자료형 선택에 어려움을 겪었지만, `double` 형변환과 `Math.ceil()`을 활용하여 해결했다.

// check`와 `count` 변수를 사용하여 현재 배포 기준이 되는 날짜와 함께 배포할 수 있는 기능의 개수를 관리했다.

// 처음에는 다음 기능의 완료 일수를 확인할 때 `check`에서 해당 값을 빼는 방식으로 접근했지만, 배포 기준 날짜 자체가 변경되는 문제가 발생한다는 것을 알게 되었다. 
// 그래서 기준 날짜는 유지한 채 다음 기능의 완료 일수와 비교하도록 수정했다.

// if(check >= su.peek())` 조건에서 처음에는 `=`을 빠뜨려 91점이라는 결과를 받았다. 
// 원인을 찾는 데 시간이 걸렸지만, 완료 날짜가 같은 기능도 함께 배포되어야 한다는 점을 놓쳤다는 것을 알게 되었다.

// 이번 문제를 통해 Queue의 `peek()`과 `poll()`을 활용하는 방법과, 반복문에서 Queue의 크기가 계속 변할 수 있다는 점을 배웠다.

  
// 코드
import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        Queue<Integer> su = new ArrayDeque<>();
        int check = 0;
        for(int i = 0; i < progresses.length; i++){
            su.add((int) Math.ceil((double) (100 - progresses[i]) / speeds[i]));
        }
        ArrayList<Integer> as = new ArrayList<>();
        while(!su.isEmpty()){
            int count = 1;
            check = su.poll();
            for(int i = 0; i < speeds.length; i++){
                if(su.isEmpty()){
                    break;
                }else{
                    if(check >= su.peek()){
                        su.poll();
                        count++;
                    }
                }
            }
            as.add(count);   
        }
        
        int[] answer = new int[as.size()];
        for(int i = 0; i < as.size(); i++){
            answer[i] = as.get(i);
        }
        return answer;
    }
}
