package cdTest;

//프로그래머스 - Summer/Winter Coding - 소수만들기
//https://programmers.co.kr/learn/courses/30/lessons/12977

public class Solution8 {
	 public int solution(int[] nums) {
	        int answer = 0;
	        int n=0;
	        boolean check;
	        //수 3개 뽑아서 더하기
	        for(int i=0; i<nums.length; i++) {
	        	for(int j=i+1; j<nums.length; j++) {
	        		for(int k=j+1; k<nums.length; k++) {
	        			n=nums[i]+nums[j]+nums[k];
	        			System.out.println(n);
	        			//소수인지 아닌지 확인			
	        			check = sosu(n);
	        			System.out.println("check: "+check);
	        			if(check==true) {
	        				answer++;
	        			}
	        		}
	        	}
	        }

	        return answer;
	    }
	 
	 
	 public boolean sosu(int num) {
		 boolean check = true;
		 for(int i=2; i<num; i++) {
			 if(num%i==0) {
				 check=false;
				 break;
			 }
		 }
		 return check;
	 }
	 
	 
	 public static void main(String[] args) {
		Solution8 sol = new Solution8();
		int[] nums = {1,2,7,6,4};
		int ans = sol.solution(nums);
		System.out.println("ans : "+ans);
	}
}
