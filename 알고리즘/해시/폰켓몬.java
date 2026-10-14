// 문제 : 폰켓몬 배열 nums에서 전체 폰켓몬 수의 절반인 N / 2마리를 선택할 때, 선택할 수 있는 폰켓몬 종류 수의 최댓값을 구하는 문제입니다. (중복 x)

// HashMap을 사용하여 각 번호당 몇번씩인지 저장한후 N/2다 크면 N/2를 작으면 HashMap길이를 출력하였다.

// 다른 분들의 코드를 보다가 HashSet을 사용한것이 더 간결해 보였다.
// HashSet은 .add로 데이터 자체를 저장함, 중복 불가능
// 또 return에서 Max.min으로 내가 if문으로 값을 저장한것보다 간결하게 표현하였다. 

// 코드
import java.util.HashMap;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> poketmon = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            poketmon.put(nums[i], poketmon.getOrDefault(nums[i], 0) + 1);
        }
        if(nums.length/2 < poketmon.size()){
            answer = nums.length/2;
        }else{
            answer = poketmon.size();
        }
        return answer;
    }
}


// HashSet를 사용한 풀이
import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> poketmon = new HashSet<>();

        for (int num : nums) {
            poketmon.add(num);
        }

        return Math.min(nums.length / 2, poketmon.size());
    }
}
