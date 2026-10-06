// 문제 : 배열길이가 홀수면 짝수 인덱스에 +n 짝수면 홀수 인덱스에 +n후 출력

// 한번에 풀었으나 더 좋은 코드가 있어서 남겨둠
// 내 풀이도 for문에서 2씩 움직이게 하긴 했으나 그냥 -1를 해도 똑같은거 였음...
class Solution {
    public int[] solution(int[] arr, int n) {
        for (int i = arr.length - 1; i >= 0; i -= 2) {
            arr[i] += n;
        }
        return arr;
    }
}


// 코드
class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = arr;
        if(answer.length % 2 == 0){
            for(int i = 1; i < answer.length; i += 2){
                answer[i] += n;
            }
        }else{
            for(int i = 0; i < answer.length; i += 2){
                answer[i] += n;
            }
        }
        
        return answer;
    }
}
