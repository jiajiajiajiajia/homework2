package homework2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 冒泡排序 {

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
		
		
		//用公式排序
		System.out.println("用公式排序:");
		Arrays.sort( arr );
		for(int i=0;i<9;i++) {
			System.out.println(arr[i]);}

	}

}
