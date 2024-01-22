package Baekjoon;

import java.util.Scanner;

public class BOJ_2628_종이자르기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int paper_width = sc.nextInt();	// 종이의 가로
		int paper_length = sc.nextInt(); // 종이의 세로
		
		int cut_num = sc.nextInt(); // 잘라야하는 점선의 개수
		
		int horizontal[] = new int[cut_num];
		int vertical[] = new int[cut_num];
		
		for (int c = 0; c < cut_num; c++) {	
			int cut_direction = sc.nextInt(); // 자르는 방향
			
			switch (cut_direction) {
			case 0: // 자르는 방향이 가로일 때
				break;
			case 1: // 자르는 방향이 세로일 때
				
				break;
			}
		}
		
		
	}
}
