package Arrays;

public class Demo1 {

	public static void main(String[] args) {
		int arr[]= {27,17,33,44,77,11};
	   // int arr[]= {11, 17,27, 44, 77}; 
		int a=25;
		int min=Math.abs(a-arr[0]);//13
		
		int num=0;
		for(int i=0;i<arr.length;i++)
		{
			int sub=Math.abs(a-arr[i]);//13 2 8 2
			if(sub<=min)
			{
				min=sub;//2
				num=arr[i];//27
			}
		}
		System.out.println(num);
	    		
		

	}

}
