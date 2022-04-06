package cdTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

//프로그래머스 - 해시 - 완주하지 못한 선수
//https://programmers.co.kr/learn/courses/30/lessons/42576

//참고: 
//https://coding-grandpa.tistory.com/entry/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%99%84%EC%A3%BC%ED%95%98%EC%A7%80-%EB%AA%BB%ED%95%9C-%EC%84%A0%EC%88%98-%ED%95%B4%EC%8B%9C-Lv-1

public class Solution13 {
	public String solution( String[] participant, String[] completion) {
        String answer = "";
       /* //Arrays.sort(participant);
        //Arrays.sort(completion);
        System.out.println("participant : "+Arrays.toString(participant));
        System.out.println("completion : "+Arrays.toString(completion));
       for(int i=0; i<completion.length; i++) {
    	   for(int j=0; j<participant.length; j++) {
    		   if(completion[i] != participant[j]) {
    			   answer += participant[j];
    			   System.out.println("answer: "+answer);
    		   }
    		   break;
    	   }
    	
       }
        return answer;*/
        
        
        // sort/loot를 사용한 solution
        //1. 배열 정렬
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        //2. 두 배열이 다를 때 까지 찾기
        int i=0;
        for(i=0; i<completion.length; i++) {
        	if(!participant[i].equals(completion[i]))
        		break;
        }
        // 3. 여기까지 왔다는 것은 마지막 주자가 완주하지 못했다는 의미
        return participant[i];
        
    }
	
	public String solution_Hash( String[] participant, String[] completion) {
		String answer = "";
		//key는 participant의 이름, value는 count
		HashMap<String, Integer> map = new HashMap<>();
		//HashMap에 participant 추가하기
		for(String i : participant) {
			//HashMap.put(Key, Value) : HashMap에 Key와 Value를 한 쌍으로 입력하는 함수
			//count table을 만들어서 participant의 count체크 
			//HashMap.getOrDefault('B',0) 
			// : 'B'라는 Key에 해당하는 Value가 있으면 가져오고 아닐 시 0을 Default로 지정하여 사용하겠다는 의미의 함수
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		//HashMap에서 완주한 선수 빼기 
		for(String i : completion) {
			map.put(i, map.get(i)-1);
		}
		//Value가 0이 아닌 참가자 찾기
		//남아있는 한명이 완주하지 못한 사람이므로 HashMap을 돌면서 Value가 0이 아닌 사람을 찾음
		Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
		
		while(iter.hasNext()) {
			Map.Entry<String, Integer> entry = iter.next();
			if(entry.getValue() !=0 ) {
				answer = entry.getKey();
				break;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Solution13 sol = new Solution13();
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		System.out.println(sol.solution_Hash(participant, completion));
		System.out.println(sol.solution(participant, completion));
	}
}
