// 문제 : 두 문자열 정수의 합 구하기 (Long이상의 범위..)

// 범위가 Long을 넘어서 BigInteger를 사용함

// int 약 +- 21억
// long 약 +- 922경
// BigInteger 사실상 제한 없음(클래스임)
// String 형식으로 넣는 이유는 일반 숫자형으로 표현할수 없기 때문에 

// <BigInteger 기본 연산>
// a.add(b)        더하기
// a.subtract(b)   빼기
// a.multiply(b)   곱하기
// a.divide(b)     나누기
// a.remainder(b)  나머지
// 비교할때는 > 이거 아니고 comparTo()를 사용해야함
// a.compareTo(b) > 0   → a > b
// a.compareTo(b) == 0  → a == b
// a.compareTo(b) < 0   → a < b

// 코드
import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        BigInteger aa = new BigInteger(a);
        BigInteger bb = new BigInteger(b);
        BigInteger sum = aa.add(bb);
        String answer = String.valueOf(sum);
        return answer;
    }
}
