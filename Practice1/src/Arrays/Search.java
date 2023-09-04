package Arrays;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		int arr[]= {1,2,3,5,6,4};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements");
		int a=sc.nextInt();
		int found=0;
		for(int i:arr) {
			
	       found=i==a?1:0;
			
			
		}
		
		if(found==1)
		{
			System.out.println("Element is present");
		}
		else
			System.out.println("Element not present");
		
		
		

	}

}
