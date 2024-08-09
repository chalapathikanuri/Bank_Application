package Com.Bank_Application;

public class ReverseNum {
	public void reverseNum(int n) {
		int temp=n;
		int rev=0;
		while(temp!=0) {
			rev= rev*10+temp%10;
			temp=temp/10;
		}
		System.out.println(rev);
		
	}

}
