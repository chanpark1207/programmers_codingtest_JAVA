// 문제 : 정수리스트에 해당 정수가 있는지 확인해서 있으면 1 없으면 0 출력 

// 코드
class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        for(int i = 0; i < num_list.length; i++){
            if(n == num_list[i]){
                answer = 1;
                break;
            }
        }
        return answer;
    }
}
