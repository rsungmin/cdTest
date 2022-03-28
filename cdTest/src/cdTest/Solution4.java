package cdTest;

//프로그래머스 - 월간 코드 챌린지 시즌3 - 없는 숫자 더하기
//https://programmers.co.kr/learn/courses/30/lessons/86051

public class Solution4 {
	public int solution(int[] numbers) {
		
		int sum=0;
		
		for(int i=0; i<numbers.length;i++) {
			sum += numbers[i];
		}
		
		int answer = 45 - sum;
		
        return answer;
    }
	
	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		int[] numbers = {5,8,4,0,6,7,9};
		int ans = sol.solution(numbers);
		System.out.println("ans : "+ans);
	}
}
