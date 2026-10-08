// 문제 : 주어진 2차원 배열의 행열 길이중 크기가 큰 것으로 정사각형 2차원배열을 만들고 빈 부분은 0으로 채워서 출력하기

// 원래는 answer에 arr를 그냥 다 집어넣고 중첩for문을 사용하여 행열 길이만큼 0을 추가로 집어넣으려 하였으나
// 실패하고 배열의 빈부분은 자동으로 0으로 채워진다는 점이 생각나서 이용하였다.

// 코드
class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer;
        
        int rol = arr.length;
        int col = arr[0].length;
        if(rol > col){
            answer = new int[rol][rol];
        }else{
            answer = new int[col][col];
        }
        
        for(int i = 0; i < rol; i++){
            for(int j = 0; j < col; j++){
                answer[i][j] = arr[i][j];
            }
        }
        
        return answer;
    }
}
