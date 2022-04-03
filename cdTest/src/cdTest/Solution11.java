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
	        int[][] num = new int[4][3];
	        
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
	        	}else if(numbers[i]==2){
	        		num = changeNum();
	        		for(int j=0; j<4; j++) {
	        			for(int k=0; k<3; k++) {
	        				if(num[j][k] == tempL) {
	        					disL = getDist(0, 1, j, k);
	        					
	        				}if(num[j][k] == tempR) {
	        					disR = getDist(0, 1, j, k);
	        				}  
	        			}
	        		}
	        	}else if(numbers[i]==5) {
	        		num = changeNum();
	        		for(int j=0; j<4; j++) {
	        			for(int k=0; k<3; k++) {
	        				if(num[j][k] == tempL) {
	        					disL = getDist(1, 1, j, k);
	        					
	        				}if(num[j][k] == tempR) {
	        					disR = getDist(1, 1, j, k);
	        				}  
	        			}
	        		}
	        	}else if(numbers[i]==8) {
	        		num = changeNum();
	        		for(int j=0; j<4; j++) {
	        			for(int k=0; k<3; k++) {
	        				if(num[j][k] == tempL) {
	        					disL = getDist(2, 1, j, k);
	        					
	        				}if(num[j][k] == tempR) {
	        					disR = getDist(2, 1, j, k);
	        				}  
	        			}
	        		}
	        	}else if(numbers[i]==0) {
	        		num = changeNum();
	        		for(int j=0; j<4; j++) {
	        			for(int k=0; k<3; k++) {
	        				if(num[j][k] == tempL) {
	        					disL = getDist(3, 1, j, k);
	        					
	        				}if(num[j][k] == tempR) {
	        					disR = getDist(3, 1, j, k);
	        				}  
	        			}
	        		}
	        	}

	        		if(disL > disR) {
	        			answer += "L";
	        			tempL=numbers[i];
	        			System.out.println("tempL: "+tempL);
	        			System.out.println("answer: "+answer);
	        		}else if(disL < disR){
	        			answer += "R";
	        			tempR=numbers[i];
	        			System.out.println("tempR: "+tempR);
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
	        return answer;
	    }
	 
	 //거리 구하기
	 public int getDist(int a, int b,int c,int d) {
		int distance = (Math.abs(a)-Math.abs(c))+(Math.abs(b)-Math.abs(d));
		System.out.println("distance : "+distance);
		 return distance;
	 }
	 
	 //키패드 좌표 만들기
	 public int[][] changeNum() {
		 int[][] nums = new int[4][3];
		 for(int i=0; i<4;i++) {
			 for(int j=0;j<3;j++) {
				 nums[i][j]=(3*i)+(1+j*1);
			 }
		 }
		 nums[3][0]=0;
		 nums[3][1]=0;
		 nums[3][2]=0;
		 //System.out.println("nums[][] : "+Arrays.deepToString(nums));
		 return nums;
	 }
	 
	 public static void main(String[] args) {
		Solution11 sol = new Solution11();
		//int[] numbers = {1,3,4,5,8,2,1,4,5,9,5};
		int[] numbers = {1,2,3,4,5,6,7,8,9,0};
		//int[] numbers = {7,0,8,2,8,3,1,5,7,6,2};
		//String hand = "right";
		String hand = "left";
		String ans = sol.solution(numbers, hand);
		System.out.println("ans : "+ans);
	}
}
