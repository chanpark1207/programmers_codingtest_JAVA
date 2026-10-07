// 문제 : 정수n를 문자열로 변환하여 출력

// 다양한 방법이 있지만 valueOf를 사용함
// ""+n 이렇게 하는 방법이 참신해 보였음
// Integer.toString(n)도 가능

// 코드
class Solution {
    public String solution(int n) {
        String answer = "";
        return answer.valueOf(n);
    }
}
