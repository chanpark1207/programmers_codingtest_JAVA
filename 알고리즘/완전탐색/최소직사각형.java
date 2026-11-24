// 문제 : 명함의 가로와 세로 길이가 담긴 2차원 배열 sizes가 주어진다. 
// 모든 명함을 지갑에 넣을 수 있도록 명함을 회전할 수 있다는 조건에서, 
// 모든 명함을 수납할 수 있는 가장 작은 지갑의 크기(가로 × 세로)를 구하는 문제이다.


// 다른사람의 풀이중 아래 것이 깔끔해 보인다
// length = Math.max(length, Math.max(card[0], card[1]));
// height = Math.max(height, Math.min(card[0], card[1]));
// Math.max, min을 사용해 계속해서 비교하여 저장하면서 갱신하는것이다.
// 이 방법으로 하면 내가 한것처럼 2차원배열을 하나 더 만들 필요가 없다.

// 코드
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[][] please = new int[sizes.length][2];
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] >= sizes[i][1]){
                please[i][0] = sizes[i][0];
                please[i][1] = sizes[i][1];
            }else{
                please[i][0] = sizes[i][1];
                please[i][1] = sizes[i][0];
            }
        }
        
        int w = please[0][0];
        int h = please[0][1];
        for(int i = 0; i < please.length; i++){
            if(w < please[i][0]){
                w = please[i][0];
            }
            if(h < please[i][1]){
                h = please[i][1];
            }
        }
        answer = w*h;
        return answer;
    }
}
