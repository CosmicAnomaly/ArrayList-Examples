package Lab8;
import java.text.NumberFormat;

public class LegalServicesBill implements Payable
{
	String caseName;
	String caseNumber;
	int hours;
	double rate;
	double expenses;
	boolean status;
	
	public LegalServicesBill(String caseName, String caseNumber, int hours, double rate, double expenses,
			boolean status) 
	{
		super();
		this.caseName = caseName;
		this.caseNumber = caseNumber;
		this.hours = hours;
		this.rate = rate;
		this.expenses = expenses;
		this.status = status;
	}//Constructor

	public String getCaseName() 
	{
		return caseName;
	}//getCaseName

	public void setCaseName(String caseName) 
	{
		this.caseName = caseName;
	}//setCaseName

	public String getCaseNumber() 
	{
		return caseNumber;
	}//getCaseNumber

	public void setCaseNumber(String caseNumber) 
	{
		this.caseNumber = caseNumber;
	}//setCaseNumber

	public int getHours() 
	{
		return hours;
	}//getHours

	public void setHours(int hours) 
	{
		this.hours = hours;
	}//setHours

	public double getRate() 
	{
		return rate;
	}//getRate

	public void setRate(double rate) 
	{
		this.rate = rate;
	}//setRate

	public double getExpenses() 
	{
		return expenses;
	}//getExpenses

	public void setExpenses(double expenses) 
	{
		this.expenses = expenses;
	}//setExpenses

	public boolean isStatus() 
	{
		return status;
	}//isStatus

	public void setStatus(boolean status) 
	{
		this.status = status;
	}//setStatus

	@Override
	public double getTotalDue() 
	{
		return ((hours * rate) + expenses);
	}//getTotalDue

	NumberFormat money = NumberFormat.getCurrencyInstance();
	
	@Override
	public String toString() {
		return caseName + "(" + caseNumber + ")" + " had a total of " + hours + " hours with " + 
	money.format(expenses) + " in expenses. "+ "Paid?(" + status + ")" + " Total due:";
	}//toString

}//LegalServicesBill class
