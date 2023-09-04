package Arrays;

import multithread.InsufficientBalance;

public class Account {

	public static void main(String[] args) throws InsufficientBalance, ClassNotFoundException {
		InsufficientBalance i=new InsufficientBalance();
		i.chech_bal();
		Class c=Class.forName("com.lang.String");
		System.out.println(c);

	}

}
