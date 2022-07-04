package cdTest;

//프로그래머스 - 연습문제 - 콜라츠 추측
//https://programmers.co.kr/learn/courses/30/lessons/12943

public class Solution23 {
	 public int solution(long num) {
	        int answer = 0;
	        
	        while(num != 1) {
	        	if(num%2 == 0) {
	        		num = num/2;
	        		answer++;
	        		System.out.println(num);
	        		System.out.println(answer);
	        	}else if(num%2 == 1) {
	        		num = (num*3)+1;
	        		answer++;
	        		System.out.println(num);
	        		System.out.println(answer);
	        	}else if(num == 1){
	        		return 0;
	        	}
	        	if(answer>=500 && num != 1) {return -1;}
	        }
	        return answer;
	    }
	 
	 public static void main(String[] args) {
		Solution23 s = new Solution23();
		int a = s.solution(626331);
		System.out.println("a : "+a);
	}
}
