package cdTest;

//프로그래머스 - 연습문제 - 핸드폰번호가리기
//https://programmers.co.kr/learn/courses/30/lessons/12948

public class Solution21 {
	public String solution(String phone_number) {
        String answer = "";
        String num = phone_number.substring(phone_number.length()-4, phone_number.length());
        
        for(int i=0;i<phone_number.length()-4;i++) {
        	answer+="*";
        }
        answer+=num;
        return answer;
    }
	
	public static void main(String[] args) {
		Solution21 s = new Solution21();
		String a = s.solution("01012345678965");
		System.out.println("a: "+a);
	}
}
