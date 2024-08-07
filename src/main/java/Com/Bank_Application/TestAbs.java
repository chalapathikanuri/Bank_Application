package Com.Bank_Application;

public abstract class TestAbs {
	public abstract void saving();

	abstract void current();

	abstract void branch_details();

	public void salary(int sal) {
		System.out.println("salary");
	}

}
class c extends TestAbs{
	public void saving() {
		System.out.println("Savings=20000");

	}

	public void current() {
		System.out.println("Current=67000");

	}

	public void branch_details() {
		System.out.println("Laocation=Rajahmundry");

	}
	@Override
	public void salary(int sal) {
		System.out.println("saalary="+sal);

	}

}


