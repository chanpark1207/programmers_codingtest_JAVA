// 문제 : 문자열 배열 picture로 주어진 그림을 가로와 세로 방향으로 각각 k배 확대한다.
// picture의 각 문자는 하나의 픽셀을 의미한다.
// .과 x로 구성되어 있다.
// 가로로는 각 문자를 k번 반복한다.
// 세로로는 만들어진 한 줄을 k번 반복한다.
// 확대된 그림을 문자열 배열로 반환한다.

// 아쉬운점 : 
// substring 말고 chatAt를 사용했어도 된다.
// O(R(Ck)²) 시간복잡도가 굉장히 복잡

// 코드
class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int count = 0;
        for(int i = 0; i < picture.length; i++){
            String len = "";
            for(int j = 0; j < picture[i].length(); j++){
                for(int z = 0; z < k; z++){
                    len += picture[i].substring(j ,j+1);
                }
            }
            for(int q = 0; q < k; q++){
                answer[count] = len;
                count++;
            }
        }
        return answer;
    }
}
