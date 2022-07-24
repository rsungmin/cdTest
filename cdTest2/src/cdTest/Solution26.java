package cdTest;

import java.util.Arrays;

//프로그래머스 - 연습문제 - 시저암호
//https://school.programmers.co.kr/learn/courses/30/lessons/12926

public class Solution26 {
	    public String solution(String s, int n) {
	        String answer = "";
			/*
			 * char[] upper = {'A','B','C','D','E','F','G','H','I','J','K',
			 * 'L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'}; char[] lower =
			 * {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
			 * 'o','p','q','r','s','t','u','v','w','x','y','z'}; //String을 char로 변환 - 모든 글자
			 * char 배열에 넣기 //.charAt(); : 한글자만 가져오기 char[] chr = s.toCharArray(); int tmp;
			 * //char를 int로 for(int i=0; i<chr.length; i++) { //공백처리 if(chr[i] != ' ') {
			 * 
			 * tmp = (int)chr[i]; tmp += n; if(tmp > 90) { tmp = 65+n;
			 * System.out.println("if"); }else if(tmp > 122) { tmp -= 25;
			 * System.out.println("else if"); } chr[i] = (char)tmp; } }
			 */
	        char[] chr = s.toCharArray();
	        int tmp;
	       
	        for(int i=0; i<chr.length; i++) {
	        	
	        	if(chr[i] != ' ') {
	        		if(chr[i] != 'z' && chr[i] != 'Z') {
	        			tmp = (int)chr[i];
	        			tmp += n;
	        			chr[i] = (char)tmp;
	        		}
	        		
	        		if(chr[i] == 'z') {
	        			tmp = 97+(n-1);
	        			chr[i] = (char)tmp;
	        		}
                    if(chr[i] == 'Z') {
	        			tmp = 65+(n-1);
	        			chr[i] = (char)tmp;
	        		}
	        	}
	        	
	        }
	        answer = String.valueOf(chr);
	        return answer;
	    }
	    public static void main(String[] args) {
			Solution26 s = new Solution26();
			String a = s.solution("A B", 25);
			System.out.println("a : "+a);
		}
	
}
