// 문제 : 정수로 이루어진 문자열을 앞쪽 0은 떼고 String로 출력

// 문자열 0019를 정수로 바꾸면 앞에 00은 자동으로 떼고 저장된다..!

// 코드
class Solution {
    public String solution(String n_str) {
        String answer = String.valueOf(Integer.parseInt(n_str));
        
        return answer;
    }
}
