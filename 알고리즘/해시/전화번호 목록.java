// 문제 : 전화번호 목록중에서 서로 접두사인것을 찾고 있으면 false 없으면 true출력

// 새로배운거 : A.startsWith(B) A가 B로 시작하는지 포함은 contains
// HashSet.contains(value) 해시셋에 해당값이 존재하는지 확인

// subString으로 하는 이유는 모든 전화번호를 서로 계속 처음부터 비교하는 대신, 각 전화번호의 접두어를 만들고 해시셋에서 한번에 확인기 위해서 이다.

// 코드 (정확성은100퍼센트이나 효율성이 조금 떨어짐)
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        String[] pb = phone_book;
        for(int i = 0; i < phone_book.length; i++){
            for(int j = 0; j < phone_book.length; j++){
                if(pb[i].startsWith(phone_book[j]) && !pb[i].equals(phone_book[j])){
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }
}


// 정답 코드
import java.util.HashSet;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashSet<String> map = new HashSet<>();
        for(String phone: phone_book){
            map.add(phone);
        }
        for(String phone: phone_book){
            for(int i = 1; i < phone.length(); i++){
                String du = phone.substring(0, i);
                
                if(map.contains(du)){
                    answer = false;
                    break;
                }
            }
        }
        
        return answer;
    }
}
