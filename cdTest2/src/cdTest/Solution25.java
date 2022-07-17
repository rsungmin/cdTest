package cdTest;

// 프로그래머스 - 연습문제 - 제일 작은 수 제거하기
//https://school.programmers.co.kr/learn/courses/30/lessons/12935

import java.util.Arrays;

public class Solution25 {
	 public int[] solution(int[] arr) {
		 int[] answer= {};
	        int min=arr[0];
	        int idx = 0;
	        if(arr.length > 1) {
	        	answer = new int[arr.length-1];
	        	for(int i=0; i<arr.length; i++) {
		        	if(arr[i] < min) {
		        		min = arr[i];
		        	}
		        }
	        	
	        	for(int j=0; j<arr.length; j++) {
	        		if(arr[j] == min) {
	        			continue;
	        		}else {
	        			answer[idx++]=arr[j];
	        		}
	        	}
	        }else if(arr.length==1) {
	        	int[] answer2 = {-1}; 
	        	return answer2;
	        }
	        return answer;
	    }
	 public static void main(String[] args) {
		Solution25 s = new Solution25();
		//int[] arr = {4,3,2,1};
		//int[] arr = {10};
		int[] arr = {-1, 6, 2, 5};
		int[] a = s.solution(arr);
		System.out.println("a : "+Arrays.toString(a));
		
	}
}
