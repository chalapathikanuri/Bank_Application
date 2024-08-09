package Com.Bank_Application;

public class Main {

	public static void main(String[] args) {
//		int sal=57898;
//		TestAbs b = new c();
//		b.branch_details();
//		b.salary(sal);
//		b.saving();
//		b.current();
		int fibonacciSeries = Integer.parseInt(Config.fibonacciSeries);
		Testing2 t2= new Testing2();
		t2.fibonacciSeries(fibonacciSeries);
		int evenOrOdd = Integer.parseInt(Config.checkEvenOrOdd);
		CheckEvenOrOdd c1= new CheckEvenOrOdd();
		c1.evenOrOdd(evenOrOdd);
		Palindrome p= new Palindrome();
		p.palindromeNum(121);

	}

}	