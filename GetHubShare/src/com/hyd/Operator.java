package com.hyd;

import java.util.Scanner;

public class Operator{
	//实现算术运算
	public void arithmeticOperator(int a,int b){
		System.out.println(a + "+" + b + "的值为：" + (a + b));//两数相加
		System.out.println(a + "-" + b + "的值为：" + (a - b));//两数相减
		System.out.println(a + "*" + b + "的值为：" + (a * b));//两数相乘
		System.out.println(a + "/" + b + "的值为：" + ((double)a / (double)b));//两数相除
		System.out.println(a + "%" + b + "的值为：" + (a % b));//两数取余
	}
	//实现自增自减运算
	public void increaseAndDecrease(int a){
		System.out.println("++" + a + "的值为：" + (++a));//前缀自增
		System.out.println(a + "++" + "的值为：" + (a++));//后缀自增
		System.out.println("--" + a + "的值为：" + (--a));//前缀自减
		System.out.println(a + "--" + "的值为：" + (a--));//后缀自减
	}
	//实现关系运算
	public void relationalOperators(int a,int b){
		System.out.println(a + ">" + b + "的值为：" + (a > b));//大于
		System.out.println(a + ">=" + b + "的值为：" + (a >= b));//大于等于
		System.out.println(a + "<" + b + "的值为：" + (a < b));//小于
		System.out.println(a + "<=" + b + "的值为：" + (a <= b));//小于等于
		System.out.println(a + "==" + b + "的值为：" + (a == b));//等于
		System.out.println(a + "!=" + b + "的值为：" + (a != b));//不等于
	}
	//实现逻辑运算和条件运算
	public void logicalOperators(boolean a,boolean b){
		System.out.println(a + "&" + b + "的值为：" + (a & b));//逻辑与
		System.out.println(a + "|" + b + "的值为：" + (a | b));//逻辑或
		System.out.println("!" + a + "的值为：" + (!a));//逻辑非
		System.out.println(a + "^" + b + "的值为：" + (a ^ b));//逻辑异或
		System.out.println(a + "&&" + b + "的值为：" + (a && b));//短路与
		System.out.println(a + "||" + b + "的值为：" + (a || b));//短路或
	}
	//实现左移和右移
	public void bitwiseOperators(int flag,int b){
		System.out.println(flag + "<<" + b + "的值位" + (flag<<b));//左移
		System.out.println(flag + ">>" + b + "的值位" + (flag>>b));//右移
	}
	
	//拿来一个扫描器
	Scanner sc = new Scanner(System.in);
	//方法
	//输入的不是整数，提示错误
	public void integerDebugging(){
		while(!sc.hasNextInt()){
			System.out.println("输入的不是整数！！请重新输入(显示菜单输入9)");
			sc.next();
		}
	}
	//输入的不是布尔值，提示错误
	public void booleanDebugging(){
		while(!sc.hasNextBoolean()){
			System.out.println("输入的不是true或false,请重新输入");
			sc.next();
		}
	}
	//调用上面的方法完成功能
	public void functionShi(){
		int num;//选择控制
		boolean flag = true;//开关
		while(flag) {//循环
			//友好性提示
			System.out.println("输入1算术运算，输入2自增自减运算，输入3关系运算，输入4逻辑运算，输入5位运算，输入0退出");
			integerDebugging();//调用方法，判断输入是否正确
			num = sc.nextInt();//从键盘接收数据
			switch(num){//选择
			case 1:
				System.out.println("请输入数字1：(只能输入整数)");//友好性提示
				integerDebugging();
				int num1 = sc.nextInt();//从键盘接收数据
				System.out.println("请输入数字2：(只能输入整数)");
				integerDebugging();
				int num2 = sc.nextInt();
				arithmeticOperator(num1,num2);//调用方法，完成算术运算
				break;//防止代码穿透
			case 2:
				System.out.println("请输入数字：(只能输入整数)");
				integerDebugging();
				int num3 = sc.nextInt();
				increaseAndDecrease(num3);//调用方法，完成自增自减运算
				break;
			case 3:
				System.out.println("请输入数字1：(只能输入整数)");
				integerDebugging();
				int num4 = sc.nextInt();
				System.out.println("请输入数字2：(只能输入整数)");
				integerDebugging();
				int num5 = sc.nextInt();//从键盘接收数据
				relationalOperators(num4,num5);//调用方法，完成关系运算
				break;//防止代码穿透
			case 4:
				System.out.println("请输入布尔值1：(只能输入true或false)");
				booleanDebugging();//调用方法，判断输入是否正确
				boolean b1 = sc.nextBoolean();
				System.out.println("请输入布尔值2：(只能输入true或false)");
				booleanDebugging();
				boolean b2 = sc.nextBoolean();
				logicalOperators(b1, b2);//调用方法，完成逻辑运算
				break;
			case 5:
				System.out.println("请输入数字1：(只能输入整数)");//友好性提示
				integerDebugging();
				int num6 = sc.nextInt();//从键盘接收数据
				System.out.println("请输入数字2：(只能输入整数)");
				integerDebugging();//调用方法，判断输入是否正确
				int num7 = sc.nextInt();
				bitwiseOperators(num6, num7);//调用方法，完成位运算
				break;
			case 0:
				System.out.println("程序退出，谢谢使用");//循环结束提示
				flag = false;//关闭开关
				break;
			case 9:
				break;
			default://默认选择
				System.out.println("输入错误，请重新输入");
			}
		}
	}
}
