package cdTest;

//���α׷��ӽ� - �������� - ¦���� Ȧ��
//https://programmers.co.kr/learn/courses/30/lessons/12937

public class Solution24 {
	public String solution(int num) {
        String answer = "";
        if(num%2 == 0) {
        	answer = "Even";
        }else {
        	answer = "Odd";
        }
        return answer;
    }
	
	public static void main(String[] args) {
		Solution24 s = new Solution24();
		System.out.println("a : "+s.solution(4));
	}
}
