package cdTest;

//프로그래머스 - 연습문제 - 하샤드 수 
//https://programmers.co.kr/learn/courses/30/lessons/12947

public class Solution22 {
	public boolean solution(int x) {
		 
		boolean answer = true;
		String xnum = Integer.toString(x);
		int[] arr = new int[xnum.length()];
		int temp=0;
		for (int i=0; i<xnum.length();i++) {
			arr[i] = xnum.charAt(i)-'0';
		}
		for(int j=0; j<arr.length; j++) {
			temp += arr[j];
		}
		if(x%temp == 0) {
			return answer;
		}else {
			answer = false;
		}
	    return answer;
	    }
	
	public static void main(String[] args) {
		Solution22 s = new Solution22();
		boolean a = s.solution(11);
		System.out.println("a : "+a);	}
}
