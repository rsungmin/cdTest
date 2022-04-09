package cdTest;

import java.util.ArrayList;
import java.util.Arrays;

//프로그래머스 - 완전탐색 - 모의고사
//https://programmers.co.kr/learn/courses/30/lessons/42840
public class Solution15 {
	public int[] solution(int[] answers) {
        int[] answer = {};
        int[] one = new int[answer.length];
        int[] two = new int[answer.length];
        int[] three = new int[answer.length];
        int cnt1=0;
        int cnt2=0;
        int cnt3=0;
        
        //one에 수포자1 답 넣기
        for(int i=0; i<one.length; i++) {
        	one[i]=5%(i+1);
        }
        
        //two에 수포자2 답 넣기
        for(int i=0; i<two.length; i++) {
        	if(i%2==0) {
        		two[i]=2;
        	}else if(i/2==4*i) {
        		two[i]=1;
        	}else if(i%2==4*i+1) {
        		two[i]=3;
        	}else if(i%2==4*i+2) {
        		two[i]=4;
        	}else if(i%2==4*i+3) {
        		two[i]=5;
        	}
        }
        
        //three에 수포자3 답 넣기
        for(int i=0; i<three.length; i++) {
        	if(i%10==0 || i%10==1) {
        		three[i]=3;
        	}else if(i%10==2 || i%10==3) {
        		three[i]=1;
        	}else if(i%10==4 || i%10==5) {
        		three[i]=2;
        	}else if(i%10==6 || i%10==7) {
        		three[i]=4;
        	}else if(i%10==8 || i%10==9) {
        		three[i]=5;
        	}
        }
        
        //각 배열과 answer[] 비교
        for(int i=0; i<answer.length; i++) {
        	if(answer[i]==one[i]) {
        		 cnt1++;
        	}else if(answer[i]==two[i]) {
        		cnt2++;
        	}else if(answer[i]==three[i]) {
        		cnt3++;
        	}
        }
        
        //cnt 중에 최대값
        int max = Math.max(Math.max(cnt1, cnt2),cnt3); 
        ArrayList<Integer> list = new ArrayList<>();
        if(max==cnt1) {list.add(1);}
        if(max==cnt2) {list.add(2);}
        
        if(max==cnt3) {list.add(3);}
        
        answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) {
        	answer[i]=list.get(i);
        }
        return answer;
    }
	
	
	public int[] solution2(int[] answers) {
		int[] answer= {};
		int[] one = {1,2,3,4,5};
		int[] two = {2,1,2,3,2,4,2,5};
		int[] three = {3,3,1,1,2,2,4,4,5,5};
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		
		for(int i=0;i<answers.length;i++) {
			if(one[i%one.length]==answers[i]) {cnt1++;}
			if(two[i%two.length]==answers[i]) {cnt2++;}
			if(three[i%three.length]==answers[i]) {cnt3++;}
		}
		
		 int max = Math.max(Math.max(cnt1, cnt2),cnt3); 
	     ArrayList<Integer> list = new ArrayList<>();
	     if(max==cnt1) {list.add(1);}
	     if(max==cnt2) {list.add(2);}
	     if(max==cnt3) {list.add(3);}
	     
	     answer = new int[list.size()];
	        for(int i=0; i<answer.length; i++) {
	        	answer[i]=list.get(i);
	        }
	     
		return answer;
	}
	public static void main(String[] args) {
		Solution15 sol = new Solution15();
		//int[] answers= {1,2,3,4,5};
		int[] answers= {1,3,2,4,2};
		System.out.println(Arrays.toString(sol.solution2(answers)));
	}
}
