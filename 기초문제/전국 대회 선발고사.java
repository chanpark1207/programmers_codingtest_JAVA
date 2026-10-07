// 문제 : 학생들의 등수와 대회 참여 가능 여부가 배열로 중어진다. 등수가 높은 3명을 선발하고 선발된 학생의 (인덱스)번호를 10000 × a + 100 × b + c 계산 해서 반환한다.

// 어려웠던점 : 학생들의 점수을 계산하는것이 아니라 처음주어진 인덱스 번호를 기준으로 계산해야해서 머리속에 풀이가 잘 구상되지 않았다.
// 등수를 하나 올릴때마다 배열 전체를 다시 탐색해야하는 아쉬운 점이 있다.

// 코드
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int count = 0;
        int maxscore = 1;
        int[] gg = new int[3];
        while(count != 3){
            for(int i = 0; i < rank.length; i++){
                if(rank[i] == maxscore && attendance[i]){
                    gg[count] = i;
                    count++;
                }
            }
            maxscore++;
        }
        answer = 10000*gg[0] + 100*gg[1] + gg[2];
        return answer;
    }
}
