// 문제: 정수 배열 `arr`의 길이가 **2의 거듭제곱**이 되도록 뒤에 `0`을 최소한으로 추가한다.
// 거듭제곱이라면 그대로 출력

// 어려웠던점
// copyOf라는 함수를 전혀 모른 상태에서 접근함
// 거듭제곱의 처음값인 two을 처음에는 2로 잡아서 배열의 길이가 1일때 오류가 발생함

// Arrays.copyOf(원본배열, 새로운 길이) - 늘리는거 줄이는거 다 가능

// 코드
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            al.add(arr[i]);
        }
        int expon = arr.length;
        int two = 1;
        while(true){
            if(expon > two){
                two *= 2;
            }else if(expon == two){
                break;
            }else{
                expon += 1;
            }
        }
        
        for(int i = al.size(); i < expon; i++){
            al.add(0);
        }
        int[] answer = new int[al.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = al.get(i);
        }
        return answer;
    }
}
