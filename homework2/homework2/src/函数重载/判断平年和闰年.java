package 函数重载;

public class 判断平年和闰年 {

	public static void main(String[] args) {
		bissextile(1900);

	}
	
	public static void bissextile(int a) {
		if(a%100==0) {
			if(a%400==0) {System.out.println("这一年为闰年。");}
			else {System.out.println("这一年不是闰年。"); }
		}else if (a%4==0 ){
			System.out.println("这一年是闰年。");
		}else {
			System.out.println("这一年不是闰年。");
		}
		
	}

}
