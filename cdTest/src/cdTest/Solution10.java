package cdTest;

//프로그래머스 - 2021 Dev-Matching: 웹 백엔드 개발자 - 로또의 최고 순위와 최저순위
//https://programmers.co.kr/learn/courses/30/lessons/77484

import java.util.Arrays;

public class Solution10 {
	 public int[] solution(int[] lottos, int[] win_nums) {
	        int[] answer= new int[2];
	        int temp_e=0;
	        int temp_z=0;

	        for(int i=0; i<lottos.length; i++) {
	        	for(int j=0; j<win_nums.length; j++) {
	        		//일치하는 숫자의 개수
	        		if(lottos[i] == win_nums[j]) {
	        			temp_e++;
	        			//temp_e = lottos[i];
	        			//System.out.println("temp_e : "+temp_e);
	        		}
	        	}
	        	//0의 개수
	        	if(lottos[i]==0) {
	        		temp_z++;;
	        	}	        		
	        	
	        }
	        System.out.println("temp_e: "+temp_e);
	        System.out.println("temp_z: "+temp_z);

	        //최고
	        int an1 = temp_e + temp_z;

	        
	        switch(temp_e) {
	        case 0: case 1: 
	        	answer[1]=6;
	        	break;
	        case 2:
	        	answer[1]=5;
	        	break;
	        case 3:
	        	answer[1]=4;
	        	break;
	        case 4:
	        	answer[1]=3;
	        	break;
	        case 5:
	        	answer[1]=2;
	        	break;
	        case 6:
	        	answer[1]=1;
	        	break;
	        }
	        
	        switch(an1) {
	        case 0: case 1:
	        	answer[0]=6;
	        	break;
	        case 2:
	        	answer[0]=5;
	        	break;
	        case 3:
	        	answer[0]=4;
	        	break;
	        case 4:
	        	answer[0]=3;
	        	break;
	        case 5:
	        	answer[0]=2;
	        	break;
	        case 6:
	        	answer[0]=1;
	        	break;
	        
	        }
	        
	        return answer;
	    }
	 
	 public static void main(String[] args) {
		Solution10 sol = new Solution10();
		//int[] lottos = {44, 1, 0, 0, 31, 25};
		//int[] win_nums = {31, 10, 45, 1, 6, 19};
		
		//int[] lottos = {45, 4, 35, 20, 3, 9};
		//int[] win_nums = {20, 9, 3, 45, 4, 35};
		
		int[] lottos = {0, 0, 0, 0, 0, 0};
		int[] win_nums = {38, 19, 20, 40, 15, 25};
		int[] ans = sol.solution(lottos, win_nums);
		System.out.println("ans : "+Arrays.toString(ans));
	}
}
