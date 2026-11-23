// 문제 : 모든 음식의 스코빌 지수가 K 이상이 될 때까지 가장 낮은 스코빌 지수 2개를 꺼내 새로운 음식으로 섞는 문제이다. 
// 섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
// 모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우에는 -1을 return 합니다.

// 항상 문제를 끝까지 안읽어서 만들수 없는 경우 처리를 까먹는것 같다. 
// 또한 while문의 조건이 적절하지 않다. 조건을 비어있을때가 아니라 k 이하일때만 반복하게 만들면 훨씬 효율적이고 깔끔할것 같다. 

// 코드
import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int value : scoville){
            pq.add(value);
        }
        while(!pq.isEmpty()){
            int value = 0;
            if(pq.peek() >= K){
                return answer;
            }else if(pq.size() == 1){
                return -1;   
            }else{
                value = pq.poll() + (pq.poll() * 2);
                pq.add(value);
                answer++;
            }
        }
        return answer;
    }
}
