// 문제 : str1이 str2에 포함되면 1 아니면 0

// contains() 사용

// 코드
class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        if(str2.contains(str1)){
            answer = 1;
        }
        return answer;
    }
}
