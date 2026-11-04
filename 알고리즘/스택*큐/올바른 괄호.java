// 문제 : 문자열 s가 주어졌을 때, 괄호가 올바르게 짝지어져 있는지 판별하는 문제이다. 
// 여는 괄호 (는 반드시 닫는 괄호 )와 짝을 이루어야 하며, 괄호의 순서가 올바르지 않거나 짝이 맞지 않으면 false를 반환한다.

// 큐는 스택과 다르게 ArrayDeque로 쓴다는걸 기억하기
// 다른 사람들 풀이중에 "("이면 +1 ")"이면 -1을 해서 count를 사용해 큐를 사용하지 않고 하는 흥미로운 풀이가 있었음 

// 코드
import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Queue<String> parenqueue = new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++){
            if(parenqueue.isEmpty()){
                parenqueue.add(s.substring(i, i+1));
            }else{
                if(parenqueue.peek().equals("(") && s.substring(i, i+1).equals(")")){
                    parenqueue.poll();
                }else{
                    parenqueue.add(s.substring(i, i+1));
                }
            }
        }
        if(parenqueue.size() != 0){
            return false;
        }
        return answer;
    }
}
