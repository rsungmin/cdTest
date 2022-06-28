package cdTest;

import java.util.Arrays;

//프로그래머스 - 연습문제 - 행렬의 덧셈
//https://programmers.co.kr/learn/courses/30/lessons/12950

public class Solution20 {
	public int[][] solution(int[][] arr1, int[][] arr2) {
		
		int[][] answer = new int[arr1.length][arr1[0].length];
		
		int i,j; 
		for(i=0; i<arr1.length; i++) { 
			for(j=0;j<arr1[i].length;j++) {
				answer[i][j]=arr1[i][j]+arr2[i][j]; 
			 } 
		}
		 
		/*
		 * int tmp1, tmp2;
		 * 
		 * for(int i=0; i<arr1.length; i++) { for(int j=0; j<arr1.length; j++) { tmp1 =
		 * arr1[i][j]; tmp2 = arr2[i][j]; answer[i][j] =tmp1+tmp2; } }
		 */
        return answer;
    }
	
	public static void main(String[] args) {
		Solution20 s = new Solution20();
		/*
		 * int[][] arr1 = {{1,2},{2,3}}; int[][] arr2 = {{3,4},{5,6}};
		 */
		
		int[][] arr1 = {{1},{2}}; 
		int[][] arr2 = {{3},{4}};
		 
		int[][] ans = s.solution(arr1, arr2);
		System.out.println("ans : "+Arrays.deepToString(ans));
	}
}
