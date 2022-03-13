package day24;

 abstract class BankAcc {
	private int AccNo;
	private String  AccNm;
	private float AccBal;
	
	public void setAccNo(int i) {      //starts getters and setters
		AccNo = i;
	}
	public int getAccNo() {
		return AccNo ;
	}
	public void setAccNm(String j) {
		AccNm = j;
	}
	public String getAccNm() {
		return AccNm ;
	}
	public void setAccBal(float k) {
		AccBal = k;
	}
	public float getAccBal() {
		return AccBal ;
	}                               //End of getters and setters
	
	
	public BankAcc(int AccNo, String  AccNm, float AccBal) {
		
	}	
	
	public abstract void  withdraw();
	 
	 public abstract void deposit();
	 
	 public abstract String toString();
	 
	 
}
public class CaseStudy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
