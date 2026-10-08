// 문제 : n x n 크기의 2차원을 배열을 만든후 [1][1] 처럼 같을때만 1을 넣고 나머지는 0을 넣는 2차원배열 출력

// 다른 풀이들 중에 for문을 한번만 쓰는 풀이가 기억에 남음
// for(int i = 0 ; i < n ; i++) {
//          answer[i][i] = 1;
//      }
// wow.. 배열 길이 설정후 빈건 0으로 채워지고 같은 번호에만 넣으면 되기때문에..

// 코드
class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j){
                    answer[i][j] = 1;
                }else{
                    answer[i][j] = 0;
                }
            }
        }
        return answer;
    }
}
