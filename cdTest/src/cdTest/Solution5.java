package cdTest;

//프로그래머스 - 2021 카카오 채용연계형 인턴십 - 숫자 문자열과 영단어
//https://programmers.co.kr/learn/courses/30/lessons/81301

public class Solution5 {
	public int solution(String s) {
		String[] num= {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String[] number = {"0", "1", "2", "3", "4", "5", "6", "7", "8","9"};
		for(int i=0; i<10;i++) {
			s=s.replace(num[i], number[i]);
		}
		
        int answer = Integer.parseInt(s);
		
        return answer;
    }
	
	public static void main(String[] args) {
		Solution5 sol = new Solution5();
		String s = "23four5six7";
		int ans = sol.solution(s);
		System.out.println("ans : "+ans);
		
	}
}
