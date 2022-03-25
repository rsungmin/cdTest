package cdTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;


//프로 그래머스 - 월간코드 챌린지 시즌1 - 두 개 뽑아서 더하기
//https://programmers.co.kr/learn/courses/30/lessons/68644

public class Solution2 {
	 public int[] solution(int[] numbers) {
		 
	     
	       /*int temp;
	       ArrayList<Integer> list = new ArrayList<>();

	       for(int i=0;i<numbers.length;i++) {
	    	  for(int j=i+1; j<numbers.length; j++) {
	    		 temp = (numbers[i]+numbers[j]);
	    	  }	    	   
	       }
	       
	       //중복제거
	       for(int i=0; i<list.size(); i++) {
	    	   if(!list.contains(list.get(i))) {
	    		   list.add(list.get(i));
	    	   }
	       }
	       
	      Iterator iter = list.iterator();
	      if(iter.hasNext()) {
	    	  System.out.println(iter.next());	    	  	      
	      }else {
	    	  System.out.println("list 없음");
	      }
	       
	       //오름차순 정렬
	       Collections.sort(list);
	       
	       //list > answer
	       int[] answer = new int[list.size()];
	       	for(int i=0; i<answer.length; i++) {
	       		answer[i] = list.get(i);
	       	}
	       	
	        return answer;
	 
	        
	        * 중복제거가 첫번째 반복문 내에서 이루어 져야함
	        * 나눠서 하면 list가 비어있기 때문에 정상적 실행x 	      	      
	        */
	        
	        
		 int temp;
		 ArrayList<Integer> list = new ArrayList<>();
		 
		 for(int i=0; i<numbers.length;i++) {
			 for(int j=i+1; j<numbers.length; j++) {
				 temp = numbers[i]+numbers[j];
				 if(!list.contains(temp)) {
					 list.add(temp);
				 }
			 }
		 }
		 Collections.sort(list);
		 
		 int[] answer = new int[list.size()];
		 for(int i=0; i<answer.length; i++) {
			 answer[i]=list.get(i);
		 }
		 return answer;
	    }
	 
	 public static void main(String[] args) {
		 Solution2 sol = new Solution2();
		 int[] numbers = {2,1,3,4,1};
		 System.out.println("numbers: "+Arrays.toString(numbers));
		 int[] ans = sol.solution(numbers);
		 System.out.println("ans: "+Arrays.toString(ans));

	 }

}
