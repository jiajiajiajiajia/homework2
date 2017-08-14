package 函数重载;

import java.util.Scanner;

public class 阶乘方法 {

	public static void main(String[] args) {
		int a=factorial(5);
		System.out.println("它的阶乘是："+a);
	}
	public static int factorial(int p) {
		int product=1;
		int c=p;
		for(int i=1;i<=c;i++) {
			product= product*p;
			p-=1;
		}
		return product;
	}

}
