package cdTest;

//프로그래머스 - 연습문제 - 문자열다루기 기본
//https://programmers.co.kr/learn/courses/30/lessons/12918

public class Solution17 {
	 public boolean solution(String s) {
	        boolean answer = true;
	        int s_itmp = 0;

	        if(s.length()==4 || s.length()==6) {
	        	System.out.println("length ㅇㅋ");
	        	for(int i=0;i<s.length();i++) {
	        		if(s.charAt(i)=='0' ||s.charAt(i)=='1' ||s.charAt(i)=='2' ||s.charAt(i)=='3' || s.charAt(i)=='4' ||
	        				s.charAt(i)=='5' ||s.charAt(i)=='6' ||s.charAt(i)=='7' ||s.charAt(i)=='8' ||s.charAt(i)=='9') {
	        			s_itmp = s.charAt(i);
	        			System.out.println("숫자ㅇㅋ");
	        		}else {
	        			answer=false;
	        			System.out.println("문자열 ㅇㅋ "+s.charAt(i));
	        		}
	        	}
	        }else answer=false;
	        return answer;
	    }
	 public static void main(String[] args) {
		Solution17 s = new Solution17();
		System.out.println("return: "+s.solution("asaf44"));
	}
}
