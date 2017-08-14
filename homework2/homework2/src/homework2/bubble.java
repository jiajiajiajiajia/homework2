package homework2;

public class bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,4,8,6,9,0};
		int temp=0;
		for(int i=0;i<=arr.length;i++) {
			for (int j=0;j<arr.length-1;j++) {
				if (arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for (int k=0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}

	}

}
