// 문제 : 문자열 배열에서 문자열 ex가 포함된 건 빼고 하나의 문자열로 합쳐서 출력

// contains 사용

// 코드
class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        for(int i = 0; i < str_list.length; i++){
            if(!str_list[i].contains(ex)){
                answer += str_list[i];
            }
        }
        return answer;
    }
}
