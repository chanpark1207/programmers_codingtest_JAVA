// 문제 : 마라톤에 참가한 선수들의 이름이 담긴 participant 배열과 완주한 선수들의 이름이 담긴 completion 배열이 주어진다. 
// 단 한 명의 선수를 제외한 모든 선수가 완주했을 때, 완주하지 못한 선수의 이름을 반환하는 문제이다

// 원래는 해시를 사용하지 않고 직접 풀었는데 정확성은높지만 효율성테스트에서 다 탈락함 


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

// 
