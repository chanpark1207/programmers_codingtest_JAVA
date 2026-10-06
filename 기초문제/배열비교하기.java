// 문제 : 두 배열의 길이를 비교하여 1, 0, -1 출력(길이가 같을 경우 모든원소합을 비교)

// 어려웠던점
// compare를 몰랐던 상태여서 구현하는데 조금 걸림

// Integer.compare(a, b)
// a가 b보다 크면 1 작으면 -1 같으면 0

// 코드
class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int sum1 = 0;
        int sum2 = 0;
        if(arr1.length == arr2.length){
            for(int i = 0; i < arr1.length; i++){
                sum1 += arr1[i];
            }
            for(int i = 0; i < arr2.length; i++){
                sum2 += arr2[i];
            }
            if(sum1 > sum2){
                answer = 1;
            }else if(sum1 < sum2){
                answer = -1;
            }else{
                answer = 0;
            }
        }else{
            if(arr1.length >= arr2.length){
                answer = 1;
            }else{
                answer = -1;
            }
        }
        return answer;
    }
}
