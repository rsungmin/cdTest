package cdTest;

import java.util.Arrays;

public class Solution25 {
	 public int[] solution(int[] arr) {
	        int[] answer = new int[arr.length-1];
	        int min=0;
	        for(int i=0; i<arr.length; i++) {
	        	if(arr[i] < min) {
	        		min = arr[i];
	        	}
	        }
	        
	        for(int j=0;j<arr.length-1; j++) {
	        	if(arr[j] != min) {
	        		answer[j]=arr[j];
	        	}
	        }
	        if(arr.length==1) {
	        	answer[0] = -1;
	        }
	        return answer;
	    }
	 public static void main(String[] args) {
		Solution25 s = new Solution25();
		//int[] arr = {4,3,2,1};
		int[] arr = {10};
		int[] a = s.solution(arr);
		System.out.println("a : "+Arrays.toString(a));
		
	}
}
