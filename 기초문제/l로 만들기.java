// 문제 : 알파벳 소문자로 이루어진 문자열에서 "l"보다 앞서는 문자열을 다 l로 바꾸기

// l의 아스키 코드를 이용해서 아스키코드가 더 낮을경우 앞서는걸로 판단하고 l로 바꿈

// if (myString.charAt(i) <= 'l') 이것도 가능하다고 한다.... java에서는 내부적으로 유니코드로 취급할수 있다고 한다. 

// 코드
class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i = 0; i < myString.length(); i++){
            if(108 > (int) myString.charAt(i)){
                answer += "l";
            }else{
                answer += myString.substring(i,i+1);
            }
        }
        return answer;
    }
}
