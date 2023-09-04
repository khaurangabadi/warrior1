package Arrays;

public class Frquency1 {

	public static void main(String[] args) {
		int arr[]= {1,2,1,3,-1,3,5,-1};
		
		
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			System.out.println(arr[i]+"---"+count);
		}
		
		

	}

}
