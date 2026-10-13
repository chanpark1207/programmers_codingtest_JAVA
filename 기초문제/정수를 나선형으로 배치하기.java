// 문제 : 정수 n이 주어질 때, n × n 크기의 2차원 배열에 1부터 n²까지의 정수를 시계 방향 나선형으로 순서대로 채운 배열을 반환하는 문제이다.

// 풀이 방법 : 나선형이 꺽이는 부분의 규칙을 찾아서 나선형이 작아져도 사용할수 있는 식을 만듬
// 0 ,0
// 0, n
// n, n
// n, 0
// 1, 0

// 1,1
// 1, n-1
// n-1, n-1
// n-1. 1
// 2,1

// . . 이런식으로 직사각형이 줄어들때마다 1씩 +되기 때문에
// 반복횟수를 정하고 그만큼 반복하게 해보았다

// 어려웠던점 : 식을 만들고 대입할때 while문이 끝나고 난후 i, j , value의 값이 꼬여서 index범위가 넘어가는 오류가 있었음
// -> 제일 큰 직사각형을 먼저한다 생각하고 index범위를 먼저 잡은 후 어디서 뺴고 더해야 하는지 구하였다.

// 개선할점 : 안쪽에 while문을 for문으로 바꾸면 변수가 값이 꼬이는걸 줄일수 있을것 같다, 또한 코드가 한눈에 보기 쉽게 정돈될것 같다. 

// 코드
class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int value = 1;
        int i = 0;
        int j = 0;
        int count = 0;
        int check = n/2;
        while(check != 0){
         while(answer[count][n-count-1] == 0){
                answer[i][j] = value;
                value++;
                j++;
            }
            j--;
            value--;
            while(answer[n-count-1][n-count-1] == 0){
                
                answer[i][j] = value;
                value++;
                i++;
            }
            i--;
            value--;
            while(answer[n-count-1][count] == 0){
                
                answer[i][j] = value;
                value++;
                j--;
            }
            j++;
            value--;
            while(answer[count+1][count] == 0){
                
                answer[i][j] = value;
                value++;
                i--;
            }
            i++;
            j = i;
            count++;  
            check--;
        }
        if(n%2 == 1){
            answer[n/2][n/2] = n*n;
        }
        return answer;
    }
}
