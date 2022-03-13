package day24;

abstract class BankFactory {
	
	public abstract SavingAcc getNewSavingAcc();
	
	public abstract CurrentAcc getNewCurrentAcc();

}

 abstract class MMSavingAcc extends BankFactory {

	private static final float minBal = 20;
	
	public static float getMinbal() {
		return minBal;
	}              
	public MMSavingAcc(int AccNo, String AccNm, float BankAcc, boolean isSalaried) {
		super();
	}

  public float withdraw() {
	return 0;
}
		
	@Override
	public String toString() {
		String demo="demo_2";
         return demo;
	}
}
 abstract class MMCurrentAcc extends BankFactory {
	 
	 abstract public float withdraw() ;
	 
	 @Override
     public String toString() {
		 String demo = "demo_3";
		return demo;	 
	 }
	 public MMCurrentAcc(int AccNo, String AccNm, float BankAcc, float creditLimit) {
			super();
	 }
 }