package com.hyd2;

import java.util.Scanner;

public class TestSwitch {
	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的成绩");
		while(!sc.hasNextInt()) {
			System.out.println("输入错误");
			sc.next();
		}
		num = sc.nextInt();
		if(num >= 0 && num <= 100) {
			switch(num/10) {
			case 10:
			case 9:
				System.out.println("你的评分为：A");
				break;
			case 8:
				System.out.println("你的评分为：B");
				break;
			case 7:
				System.out.println("你的评分为：C");
				break;
			case 6:
				System.out.println("你的评分为：D");
				break;
			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:
				System.out.println("你的评分为：E");
			}
		}else {
			System.out.println("成绩无效");
		}
		
	}

}
