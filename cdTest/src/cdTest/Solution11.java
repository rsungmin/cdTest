package cdTest;

import java.util.Arrays;

//프로그래머스 - 2020 카카오 인턴십 - 키패드 누르기
//https://programmers.co.kr/learn/courses/30/lessons/67256

public class Solution11 {
	 public String solution(int[] numbers, String hand) {
	        String answer = "";
	        int tempL=0;
	        int tempR=0;
	        int disL=0;
	        int disR=0;
	        
	        System.out.println("numbers[] : "+Arrays.toString(numbers));
	        
	        for(int i=0; i<numbers.length; i++) {
	        	if(numbers[i]==1 || numbers[i]== 4 || numbers[i]==7) {
	        		answer += "L";
	        		tempL = numbers[i];
	        		System.out.println("tempL: "+tempL);
	        		System.out.println("answer: "+answer);
	        	}else if(numbers[i]==3 || numbers[i]==6 || numbers[i]==9) {
	        		answer += "R";
	        		tempR=numbers[i];
	        		System.out.println("tempR: "+tempR);
	        		System.out.println("answer: "+answer);
	        	}else if(numbers[i]==2 || numbers[i]==5 || numbers[i]==8 || numbers[i]==0){
	        		disL = getDist(tempL, numbers[i]);
	        		disR = getDist(tempR, numbers[i]);	        		
	        		if(disL > disR) {
	        			answer += "R";
	        			tempR=numbers[i];
	        			System.out.println("tempR: "+tempR);
		        		System.out.println("answer: "+answer);
	        		}else if(disL < disR){
	        			answer += "L";
	        			tempL=numbers[i];
	        			System.out.println("tempL: "+tempL);
		        		System.out.println("answer: "+answer);
	        		}else {
	        			if(hand=="left") {
	        				answer += "L";
		        			tempL=numbers[i];
		        			System.out.println("tempL: "+tempL);
			        		System.out.println("answer: "+answer);
	        			}else if(hand=="right"){
	        				answer += "R";
		        			tempR=numbers[i];
		        			System.out.println("tempR: "+tempR);
			        		System.out.println("answer: "+answer);
	        			}
	        		}

	        	}
	        }
	        return answer;
	    }
	 
	 //거리 구하기
	 public int getDist(int idx, int num) {
		 idx = (idx==0) ? 11 : idx;
		 num = (num==0) ? 11 : num;
		 int a = (idx-1)/3;
		 int b = (idx-1)%3;
		 int c = num/3;
		 int d = 1;
		 
		int distance = (Math.abs(a-c))+(Math.abs(b-d));
		System.out.println("distance : "+distance);
		 return distance;
	 }
	 

	 
	 
	 public static void main(String[] args) {
		Solution11 sol = new Solution11();
		//int[] numbers = {1,3,4,5,8,2,1,4,5,9,5};
		//int[] numbers = {1,2,3,4,5,6,7,8,9,0};
		int[] numbers = {7,0,8,2,8,3,1,5,7,6,2};
		//String hand = "right";
		String hand = "left";
		String ans = sol.solution(numbers, hand);
		System.out.println("ans : "+ans);
	}
}
