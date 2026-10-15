// 문제 : 옷의 이름과 종류가 담긴 2차원 배열 clothes가 주어진다.
// 각 종류별로 최대 1개의 의상만 착용할 수 있다.
// 의상을 하나도 착용하지 않는 경우를 제외하고, 서로 다른 의상 조합의 개수를 구한다.
// 의상의 일부가 같더라도 다른 의상을 추가하거나 변경하면 서로 다른 조합으로 계산한다.

// for-each문에 익숙해져야 할것 같다

// 어려웠던점 : 문제를 관통하는 하나의 식이 전체 경우의 수에서 다벗었을 경우 하나만 빼면 된다는걸 이해하고 식으로 만들기까지 어려웠다.


// 코드
import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < clothes.length; i++){
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0)+1);
        }
        int i = 0;
        for(int value : map.values()){
            answer *= value + 1;
        }
        
        return answer-1;
    }
}
