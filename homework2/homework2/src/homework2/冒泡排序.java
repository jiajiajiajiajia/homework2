package homework2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ð������ {

	public static void main(String[] args) {
		int arr[]= {1,6,2,3,9,4,5,7,8};
		
		for(int i=0;i<=9;i++) {
			for(int j=0;j<8;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<9;i++) {
			System.out.println(arr[i]);}
		
		
		//�ù�ʽ����
		System.out.println("�ù�ʽ����:");
		Arrays.sort( arr );
		for(int i=0;i<9;i++) {
			System.out.println(arr[i]);}

	}

}
