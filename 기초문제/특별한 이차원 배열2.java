// 문제 : 정수형 이차원배열이 주어지고 [i][j] == [j][i] 가 성립하면 1 아니면 0

// 문제가 정확히 이해가 되진 않았지만 예시로 보고 풀었다.

// 코드
class Solution {
    public int solution(int[][] arr) {
        int answer = 0;
        boolean checking = false;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i][j] == arr[j][i]){
                    checking = true;
                }else{
                    return answer;
                }
            }
        }
        if(checking){
            answer = 1;
        }
        return answer;
    }
}
