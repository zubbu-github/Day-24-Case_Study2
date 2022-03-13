package day24;

abstract class CurrentAcc extends BankAcc{

	private final float creditLimit = 50;
	
	public abstract void withdraw(); 
	
	public abstract String toString(); 
	
	public CurrentAcc(int AccNo, String AccNm, float BankAcc, float creditLimit) {
		super(AccNo, AccNm, creditLimit);
		
	}

}
