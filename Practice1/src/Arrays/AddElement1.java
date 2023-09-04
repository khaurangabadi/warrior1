package Arrays;

import java.util.Scanner;

public class AddElement1 {

	public static void main(String[] args) {
		//10 20 30 40 50
		//0   1  2  3  4
		
		//10 20 30 30 40 50
		// 10 20 30 30 40 50
		Scanner sc=new Scanner(System.in);
		
		
		int i;
		int arr[]= {1,2,3,4,5,6};
		
		int newarr[]=new int[arr.length+1];
		
		
		
		System.out.println("Give inde to insert your value");
		int index=sc.nextInt();//3
		System.out.println("Give inserted value");
		int new_value=sc.nextInt();
		//   i=2;2<5;i++
		int j=0;
		for( i=0;i<newarr.length;i++)
		{
			
			if(i==index)
			{
				newarr[i]=new_value;
				
			}
			else
			{
				newarr[i]=arr[j];
			
			
			
			j++;
			}
			
				
			
		}
		newarr[index]=new_value;
		
		for( i=0;i<newarr.length;i++)
		{
			System.out.println(newarr[i]);
		}


	}

}
