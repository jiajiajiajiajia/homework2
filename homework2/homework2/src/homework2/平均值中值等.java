package homework2;

public class ƽ��ֵ��ֵ�� {

	public static void main(String[] args) {
		int arr[]=new int[] {-10,2,3,246,-100,0,5};
		int sum=0,min=9999999,max=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			if(min>arr[i]) {
				min=arr[i];
			}
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		int avg=sum/arr.length;
		System.out.println("ƽ��ֵ�ǣ�"+avg+"���ֵ�ǣ�"+max+"��Сֵ�ǣ�"+min);

	}

}
