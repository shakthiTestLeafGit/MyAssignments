package Assignment3;

public class AxisBank extends BankInfo{

	public void deposit()
	{
		System.out.println("Axis bank payIn");
	}
	
	public static void main(String[] args) {
		
		AxisBank sba=new AxisBank();
		sba.deposit();
		
		BankInfo sva=new BankInfo();
		sva.deposit();
	}

}
