package Arrays;

public class Rotate {

	public static void main(String[] args) {
     int arr[]= {11,21,33,42,51};
                 //0 1  2   3 4
     //5 1 2 3 4
     //23451
     
     // 21 33 42 51 11
     
		
		int n=2;
		
		for(int i=0;i<n;i++)
		{         //last=   arr[4];//5
			int last=arr[arr.length-1];
			
			for(int j=arr.length-1;j>0;j--)
			{
				//j=4  =j3
				arr[j]=arr[j-1];
			}
			arr[0]=last;
			
			
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
