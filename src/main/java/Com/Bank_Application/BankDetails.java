package Com.Bank_Application;

public class BankDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String name=Config.name;
		int age=Integer.parseInt(Config.age);
		int customerId=Integer.parseInt(Config.customerId);
		long phoneNumber=Long.parseLong(Config.phoneNumber);
		int accNumber=Integer.parseInt(Config.accountNumber);
		String address=Config.address;
		System.out.println("Name="+name+"\n"+"age="+age+"\n"+"Customer_Id="+customerId+"\n"+"PhoneNumber="
				+phoneNumber+"\n"+"Account_Number="+accNumber+"\n"+"Address="+address);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e.toString());
		}

	}

}
