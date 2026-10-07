// 문제 : 정수 배열과 k가 주어지는데 k가 짝수면 각 배열에 + k 홀수면 각 배열에 *k 한후 출력

// 코드
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = arr;
        if(k%2 == 0){
            for(int i = 0; i < answer.length; i++){
                answer[i] += k;
            }
        }else{
            for(int i = 0; i < answer.length; i++){
                answer[i] *= k;
            }
        }
        return answer;
    }
}
