package homework2;

public class �������� {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		for(int i=0;i<5;i++) {
			int arr2=arr[i];
			System.out.println(arr2);
		}
		
		
		System.out.println("�ù�ʽ�����");
		int arr2[]=new int [5];
		System.arraycopy(arr,0,arr2,0,5);
		for(int i=0;i<5;i++) {
			System.out.println(arr2[i]);
		}

	}

}
