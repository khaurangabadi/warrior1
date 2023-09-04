package Arrays;

public class Shuffle {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int n=1,j;
		for(int i=0;i<n;i++)
		{
			int first=arr[0];
			
			for( j=1;j<arr.length;j++)
			{
				arr[j-1]=arr[j];
				
			}
			arr[j-1]=first;
			
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
