// 문제 : 정수 배열 arr에서 delete_list에 해당하는 원소 삭제 후 기존 순서 유지후 출력

// bollean을 for문 안쪽에 선언해서 다시 true로 하는걸 안해도 됨 
// 두번째 for문에서 break;를 사용하면 훨씬 효율적임

// 코드
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> al = new ArrayList<>();
        boolean check = true;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < delete_list.length; j++){
                if(arr[i] == delete_list[j]){
                    check = false;
                }
            }
            if(check){
                al.add(arr[i]);
            }
            check = true;
        }
        int[] answer = new int[al.size()];
        for(int i = 0; i < al.size(); i++){
            answer[i] = al.get(i);
        }
        return answer;
    }
}
