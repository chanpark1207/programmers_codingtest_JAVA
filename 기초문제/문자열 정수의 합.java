// 문제 : 정수로만 이루어진 문자열이 제공되었을때 각각자리의 정수를 더한 값 출력

// 형변환을 시도 했지만 안됨
// <형변환>
// double -> int --->  (int) num
// float -> int ---> (int) num
// char -> 숫자 ---> c - '0'
// string -> int ---> Integer.parseInt(s)
// int -> string ---> String.valueOf(num)

// long n = Long.parseLong(s);
// double n = Double.parseDouble(s); 등등

// 코드
class Solution {
    public int solution(String num_str) {
        int answer = 0;
        for(int i = 0; i < num_str.length(); i++){
            answer += Integer.parseInt(num_str.substring(i, i+1));
        }
        return answer;
    }
}
