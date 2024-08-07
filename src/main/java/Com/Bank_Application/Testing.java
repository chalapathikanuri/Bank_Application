package Com.Bank_Application;

public class Testing {
	int a;
	int k;
	int l;

	public void studentName() {
		System.out.println("Name:cherry");
	}

	public void studentMarks() {
		System.out.println("Marks:100");
	}

	public int studentId(int a, int b, char c, String d) {
//		System.out.println("Id=" + a);
//		System.out.println("Id="+b);
//		System.out.println("Id="+c);
//		System.out.println("Id="+d);
		return a;

	}

	private void studentCollege(String a) {
		System.out.println("college=" + a);
	}

	public static void main(String[] args) {
		Testing t = new Testing();
		t.studentName();
		t.studentCollege("narayana");
		t.studentId(89, 78, 'c', "fgbjb");
		System.out.println();
		// t.num(12);
		// t.loopF(6);

		CheckEvenOrOdd c = new CheckEvenOrOdd();
		int result = c.evenOrOdd();
		System.out.println("result=" + result);
	}

	public void num(int n) {
		for (int i = 1; i <= n; i++) {
			if (i == 5) {
				continue;
			}

			System.out.println(i);
		}
	}

	public int loopF(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(j + " ");

			}

			System.out.println(" ");
		}

		return n;
	}

//	public int checkEvenOrOdd() {
//		int i=9;
//		int j=34;
//		if (i > j) {
//			return i;
//		} else {
//			return j;
//		}
//	}

}
