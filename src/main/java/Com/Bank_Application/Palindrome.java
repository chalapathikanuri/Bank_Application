package Com.Bank_Application;

public class Palindrome {
	
	public void palindromeNum(int num) {
	
	
		int sum=0;
		
		int temp=num;
		while(temp>0) {
			
			sum=sum*10+temp%10;
			temp=temp/10;
		}
		if (sum==num){
			System.out.println("it is a palindrome number");	
		}
		else {
			System.out.println("it is not a palindrome number");
		}
		
		
	}
	}


