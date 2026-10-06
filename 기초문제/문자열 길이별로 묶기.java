// 문제설명 : 문자배열의 원소들을 각각 길이가 같은 것끼리 그룹으로 묶고 가장 개수가 많은 그룹의 크기를 return

// 어려웠던점 : 배열의 크기를 설정할때 max+1로 해야하는데 max로 해서 틀린부분 찾는데 오래걸림..
// max+1로 해야하는 이유는 배열은 0번부터 시작하기 때문에

// 코드
class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int max = 0;
        for(int i = 0; i < strArr.length; i++){
            if(max < strArr[i].length()){
                max = strArr[i].length();
            }
        }
        int[] strcount = new int[max+1];
        for(int i = 0; i < strArr.length; i++){
            strcount[strArr[i].length()]+=1;
        }
        
        for(int i = 0; i < strcount.length; i++){
            if(answer < strcount[i]){
                answer = strcount[i];
            }
        }
        
        return answer;
    }
}
