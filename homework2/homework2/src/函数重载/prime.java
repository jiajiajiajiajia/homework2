package ��������;

public class prime {
	
	public static void main(String [] args) {
		judgrPrime(50);
	}
public static void judgrPrime(int p) {
	for(;; p++) {
		boolean b = true;
		for(int i=2; i<p/2; i++) {
			if(p % i == 0) { b = false;break;}
			}
		if(!b) {continue;}
		
		break;
	}
	System.out.println("����������С�������ǣ�"+p);
}
}
