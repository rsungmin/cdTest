package cdTest;

//프로그래머스 - 연습문제 - 평균 구하기
//https://programmers.co.kr/learn/courses/30/lessons/12944

public class Solution19 {
	 public double solution(int[] arr) {
	        double answer = 0;
	        for(int i=0;i<arr.length;i++) {
	        	answer += arr[i];
	        }
	        answer = answer/arr.length;
	        return answer;
	    }
	 
	 public static void main(String[] args) {
		Solution19 s = new Solution19();
		//int[] arr = {1,2,3,4};
		int[] arr = {5,5};
		double ans = s.solution(arr);
		System.out.println("answer : "+ans);
	}
}
