package ��������;

import java.util.Scanner;

public class �׳˷��� {

	public static void main(String[] args) {
		int a=factorial(5);
		System.out.println("���Ľ׳��ǣ�"+a);
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
