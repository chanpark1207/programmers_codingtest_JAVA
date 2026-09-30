// 문제: 중복 없는 숫자 k개 저장
// arr에서 중복되지 않는 숫자를 앞에서부터 k개 선택한다.
// k개보다 적게 선택되면 나머지는 -1로 채운다.

// 어려웠던점
// arraylist에 contains가 사용되는지 몰랐었다.
// 처음에는 처음부터 계속 반복해서 중복을 확인하려 2중for문으로 문제를 접근함 -> 시간복잡도로 인해 해결이 안되는 케이스가 존재 -> for문 한번으로도 해결가능함

// <ArrayList>
// 추가하는건 - 리스트이름.add(형식에 맞는 값)
// 삭제하는거 - 리스트이름.remove(몇번째 인지)
// 지정? - 리스트이름.get(몇번째 인지)
// 길이 - 리스트이름.size()

// contains() - 괄호안에 값이 포함되어있는지 
// arraylist에서도 사용가능

// 코드
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        // 겹치는것 없이 arraylist에 집어넣기
        for(int i = 0; i < arr.length; i++){
            if(!al.contains(arr[i])){
                al.add(arr[i]);
            }
        }

        // 총 길이가 k보다 작으면 -1로 채우기
        if(al.size() < k){
            int size = al.size();
            for(int i = size; i < k; i++){
                al.add(-1); 
            }
        // 총길이가 k보다 크면 자르기
        }else if(al.size() > k){
            int size = al.size();
            for(int i = size-1; i >= k; i--){
                al.remove(i);
            }
        }
        // 문제반환형식은 건드리면 안되어서 int[]에 다시 넣어주기
        int[] answer = new int[al.size()];
        for(int i = 0; i < al.size(); i++){
            answer[i] = al.get(i);
        }
        return answer;
    }
}
