package com.hyd2;

import java.util.Scanner;

public class TestSwitch {
	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ĳɼ�");
		while(!sc.hasNextInt()) {
			System.out.println("�������");
			sc.next();
		}
		num = sc.nextInt();
		if(num >= 0 && num <= 100) {
			switch(num/10) {
			case 10:
			case 9:
				System.out.println("�������Ϊ��A");
				break;
			case 8:
				System.out.println("�������Ϊ��B");
				break;
			case 7:
				System.out.println("�������Ϊ��C");
				break;
			case 6:
				System.out.println("�������Ϊ��D");
				break;
			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:
				System.out.println("�������Ϊ��E");
			}
		}else {
			System.out.println("�ɼ���Ч");
		}
		
	}

}
