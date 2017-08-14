package homework2;

public class 找最大数 {

	public static void main(String[] args) {
		int arr[]= {18,25,7,36,13,2,89,63};
		int max=0;
		int i=0;
		for(int j=0;j<=7;j++) {
			if(max<arr[j]) {
				max=arr[j];
				i=j;
			}
		}System.out.println("最大的数为："+max+"，它的下标为："+i);

	}

}
