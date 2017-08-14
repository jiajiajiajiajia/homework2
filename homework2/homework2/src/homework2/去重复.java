package homework2;

import org.apache.commons.lang3.ArrayUtils;

public class »•÷ÿ∏¥ {

	public static void main(String[] args) {
		int arr[]=new int[] {12,12,34,56,98,34,21};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]==arr[i]) {
					arr=ArrayUtils.remove(arr, i);
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			}
	}
}
