// 문제 : 주문서 배열에서 메뉴를 구별하고 가격에 맞게 총계 구하기

//contains 사용 까먹지 말기!

// 코드
class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(int i = 0; i < order.length; i++){
            if(order[i].contains("americano") || order[i].contains("anything")){
                answer += 4500;
            }else if(order[i].contains("cafelatte")){
                answer += 5000;
            }
        }
        return answer;
    }
}
