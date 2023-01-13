package algorithm;

import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        for(int i=0; i<array.length; i++) {
        	if(array[i] == array[0]) {
        		
        	}
        }
        
        return answer;
    }
}

//입출력 예 #1
//[1, 2, 3, 3, 3, 4]에서 1은 1개 2는 1개 3은 3개 4는 1개로 최빈값은 3입니다.

//입출력 예 #2
//[1, 1, 2, 2]에서 1은 2개 2는 2개로 최빈값이 1, 2입니다. 최빈값이 여러 개이므로 -1을 return 합니다.

//입출력 예 #3
//[1]에는 1만 있으므로 최빈값은 1입니다.
