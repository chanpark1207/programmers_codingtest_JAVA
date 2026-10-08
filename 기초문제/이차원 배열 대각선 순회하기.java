// 문제 : 2차원정수 배열에서 정수 k가 주어질때 i+ j <= k를 만족하는 모든 board[i][j]의 합을 return

// 2차원 배열의 세로 길이와 가로길이
// 가로길이는 배열[i].length
// 세로길이는 배열.length

// 코드
class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(i + j <= k){
                    answer += board[i][j];
                }
            }
        }
        return answer;
    }
}
