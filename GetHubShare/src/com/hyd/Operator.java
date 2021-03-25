package com.hyd;

import java.util.Scanner;

public class Operator{
	//ʵ����������
	public void arithmeticOperator(int a,int b){
		System.out.println(a + "+" + b + "��ֵΪ��" + (a + b));//�������
		System.out.println(a + "-" + b + "��ֵΪ��" + (a - b));//�������
		System.out.println(a + "*" + b + "��ֵΪ��" + (a * b));//�������
		System.out.println(a + "/" + b + "��ֵΪ��" + ((double)a / (double)b));//�������
		System.out.println(a + "%" + b + "��ֵΪ��" + (a % b));//����ȡ��
	}
	//ʵ�������Լ�����
	public void increaseAndDecrease(int a){
		System.out.println("++" + a + "��ֵΪ��" + (++a));//ǰ׺����
		System.out.println(a + "++" + "��ֵΪ��" + (a++));//��׺����
		System.out.println("--" + a + "��ֵΪ��" + (--a));//ǰ׺�Լ�
		System.out.println(a + "--" + "��ֵΪ��" + (a--));//��׺�Լ�
	}
	//ʵ�ֹ�ϵ����
	public void relationalOperators(int a,int b){
		System.out.println(a + ">" + b + "��ֵΪ��" + (a > b));//����
		System.out.println(a + ">=" + b + "��ֵΪ��" + (a >= b));//���ڵ���
		System.out.println(a + "<" + b + "��ֵΪ��" + (a < b));//С��
		System.out.println(a + "<=" + b + "��ֵΪ��" + (a <= b));//С�ڵ���
		System.out.println(a + "==" + b + "��ֵΪ��" + (a == b));//����
		System.out.println(a + "!=" + b + "��ֵΪ��" + (a != b));//������
	}
	//ʵ���߼��������������
	public void logicalOperators(boolean a,boolean b){
		System.out.println(a + "&" + b + "��ֵΪ��" + (a & b));//�߼���
		System.out.println(a + "|" + b + "��ֵΪ��" + (a | b));//�߼���
		System.out.println("!" + a + "��ֵΪ��" + (!a));//�߼���
		System.out.println(a + "^" + b + "��ֵΪ��" + (a ^ b));//�߼����
		System.out.println(a + "&&" + b + "��ֵΪ��" + (a && b));//��·��
		System.out.println(a + "||" + b + "��ֵΪ��" + (a || b));//��·��
	}
	//ʵ�����ƺ�����
	public void bitwiseOperators(int flag,int b){
		System.out.println(flag + "<<" + b + "��ֵλ" + (flag<<b));//����
		System.out.println(flag + ">>" + b + "��ֵλ" + (flag>>b));//����
	}
	
	//����һ��ɨ����
	Scanner sc = new Scanner(System.in);
	//����
	//����Ĳ�����������ʾ����
	public void integerDebugging(){
		while(!sc.hasNextInt()){
			System.out.println("����Ĳ���������������������(��ʾ�˵�����9)");
			sc.next();
		}
	}
	//����Ĳ��ǲ���ֵ����ʾ����
	public void booleanDebugging(){
		while(!sc.hasNextBoolean()){
			System.out.println("����Ĳ���true��false,����������");
			sc.next();
		}
	}
	//��������ķ�����ɹ���
	public void functionShi(){
		int num;//ѡ�����
		boolean flag = true;//����
		while(flag) {//ѭ��
			//�Ѻ�����ʾ
			System.out.println("����1�������㣬����2�����Լ����㣬����3��ϵ���㣬����4�߼����㣬����5λ���㣬����0�˳�");
			integerDebugging();//���÷������ж������Ƿ���ȷ
			num = sc.nextInt();//�Ӽ��̽�������
			switch(num){//ѡ��
			case 1:
				System.out.println("����������1��(ֻ����������)");//�Ѻ�����ʾ
				integerDebugging();
				int num1 = sc.nextInt();//�Ӽ��̽�������
				System.out.println("����������2��(ֻ����������)");
				integerDebugging();
				int num2 = sc.nextInt();
				arithmeticOperator(num1,num2);//���÷����������������
				break;//��ֹ���봩͸
			case 2:
				System.out.println("���������֣�(ֻ����������)");
				integerDebugging();
				int num3 = sc.nextInt();
				increaseAndDecrease(num3);//���÷�������������Լ�����
				break;
			case 3:
				System.out.println("����������1��(ֻ����������)");
				integerDebugging();
				int num4 = sc.nextInt();
				System.out.println("����������2��(ֻ����������)");
				integerDebugging();
				int num5 = sc.nextInt();//�Ӽ��̽�������
				relationalOperators(num4,num5);//���÷�������ɹ�ϵ����
				break;//��ֹ���봩͸
			case 4:
				System.out.println("�����벼��ֵ1��(ֻ������true��false)");
				booleanDebugging();//���÷������ж������Ƿ���ȷ
				boolean b1 = sc.nextBoolean();
				System.out.println("�����벼��ֵ2��(ֻ������true��false)");
				booleanDebugging();
				boolean b2 = sc.nextBoolean();
				logicalOperators(b1, b2);//���÷���������߼�����
				break;
			case 5:
				System.out.println("����������1��(ֻ����������)");//�Ѻ�����ʾ
				integerDebugging();
				int num6 = sc.nextInt();//�Ӽ��̽�������
				System.out.println("����������2��(ֻ����������)");
				integerDebugging();//���÷������ж������Ƿ���ȷ
				int num7 = sc.nextInt();
				bitwiseOperators(num6, num7);//���÷��������λ����
				break;
			case 0:
				System.out.println("�����˳���ллʹ��");//ѭ��������ʾ
				flag = false;//�رտ���
				break;
			case 9:
				break;
			default://Ĭ��ѡ��
				System.out.println("�����������������");
			}
		}
	}
}
