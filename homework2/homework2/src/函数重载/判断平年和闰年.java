package ��������;

public class �ж�ƽ������� {

	public static void main(String[] args) {
		bissextile(1900);

	}
	
	public static void bissextile(int a) {
		if(a%100==0) {
			if(a%400==0) {System.out.println("��һ��Ϊ���ꡣ");}
			else {System.out.println("��һ�겻�����ꡣ"); }
		}else if (a%4==0 ){
			System.out.println("��һ�������ꡣ");
		}else {
			System.out.println("��һ�겻�����ꡣ");
		}
		
	}

}
