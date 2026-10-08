// 문제 : 년월일이 담긴 두 배열을 비교하여 1배열이 앞서면 1 출력 아니면 0출력

// else if를 쓰지 않고 생략을 하려다가 해결이 되지 않는 케이스가 존재
// 생략하지 않고 전부 작성하는 방식으로 해결

// 코드
class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        if(date1[0] < date2[0]){
            answer = 1;
        }else if(date1[0] > date2[0]){
            return 0;
        }else{
            if(date1[1] < date2[1]){
                answer = 1;
            }else if(date1[1] > date2[1]){
                answer = 0;
            }else{
                if(date1[2] < date2[2]){
                    answer = 1;
                }else if(date1[2] > date2[2]){
                    answer = 0;
                }else{
                    answer = 0;
                }
            }
        }
        
        return answer;
    }
}
