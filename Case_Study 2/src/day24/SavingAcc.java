package day24;

 abstract class SavingAcc extends BankAcc {

	private boolean isSalaried;
	private static final float minBal = 0;
	
	
	public void setisSalaried(boolean l) {   //starts getters and setters
		this.isSalaried = l;
	}
	public boolean getisSalaried() {
		return isSalaried;
	}
	public static float getMinbal() {
		return minBal;
	}                                     //End of getters and setters
	
	
	public abstract void withdraw(); 
	
	public abstract String toString();
	
	public SavingAcc(int AccNo, String AccNm, float BankAcc, boolean isSalaried) {
		super(AccNo, AccNm, BankAcc);
	}
	}


