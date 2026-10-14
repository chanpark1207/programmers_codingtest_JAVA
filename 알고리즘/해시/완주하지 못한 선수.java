// 문제 : 마라톤에 참가한 선수들의 이름이 담긴 participant 배열과 완주한 선수들의 이름이 담긴 completion 배열이 주어진다. 
// 단 한 명의 선수를 제외한 모든 선수가 완주했을 때, 완주하지 못한 선수의 이름을 반환하는 문제이다

// 원래는 해시를 사용하지 않고 직접 풀었는데 정확성은높지만 효율성테스트에서 다 탈락함
// HashMap
// import java.util.HashMap; 사용전 임포트 하기
// HashMap<키, 값> 해시맵이름 = new HashMap<>(); ArrayList와 비슷하게 생성
// map.put(키, 값); 넣기
//map.getOrDefault(키, 0); 키 값이 있으면 그값을 가져오고 없으면 0을 가져옴
//map.get(키); 해당키의 값을 가져옴 반대로 값으로 키를 가져올수 없음

// 내가 직접 푼 코드는 참가자 한명을 찾기 위해 완주자 명단 전체를 확인할수도 있다. 최악의 경우 1000명중 999명비교해서 찾기라면 999000횟수 반복해야한다.
// 하지만 HashMap을 사용하면 키를 사용해서 비교 가능, 명단 전체를 다시 찾을 필요 없음
// 시간복잡도도 각각 - O(N의2제곱), O(N) 이다

// 내가 직접 푼 코드 (해시사용x)
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        int[] checks = new int[participant.length];
        for(int i = 0; i < completion.length; i++){
            for(int j = 0; j < participant.length; j++){
                if(completion[i].equals(participant[j]) && checks[j] == 0){
                    checks[j] = 1;
                    break;
                }
            }
        }
        for(int i = 0; i < checks.length; i++){
            if(checks[i] == 0){
                answer = participant[i];
            }
        }
        return answer;
    }
}

// 정답코드

import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        // 이름당 몇번있는지 체크
        for (int i = 0; i < participant.length; i++) {
            map.put(participant[i],
                    map.getOrDefault(participant[i], 0) + 1);
        }
        // 완주자 -1하기
        for (int i = 0; i < completion.length; i++) {
            map.put(completion[i], map.get(completion[i]) - 1);
        }
        // 0이상일경우 완주명단에 없다는 뜻이기 때문에 answer에 대입후 출력
        for (String name : map.keySet()) {
            if (map.get(name) > 0) {
                answer = name;
                break;
            }
        }

        return answer;
    }
}

