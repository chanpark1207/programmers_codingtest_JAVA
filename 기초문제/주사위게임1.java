// 문제 : 두 주사위의 숫자 a, b가 주어질 때, 두 숫자의 홀짝 여부에 따라 점수를 계산한다.
// 둘 다 홀수 → a² + b²
// 하나만 홀수 → 2 × (a + b)
// 둘 다 짝수 → |a - b|
// 계산한 점수를 반환한다.

// 절댓값 -> Math.abs() import필요없음

// 코드
class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if(a%2 == 1 && b%2 == 1){
            answer = a*a + b*b;
        }else if(a%2 == 1 || b%2 == 1){
            answer = 2*(a+b);
        }else{
            answer = Math.abs(a-b);
        }
        return answer;
    }
}
