package Lab8;

public class DomainNameRegistration implements Payable
{

	String domainName;
	double feePerYear;
	
	
	public DomainNameRegistration(String domainName, double feePerYear) 
	{
		super();
		this.domainName = domainName;
		this.feePerYear = feePerYear;
	}//Constructor
	
	public String getDomainName() 
	{
		return domainName;
	}//getDomainName

	public void setDomainName(String domainName) 
	{
		this.domainName = domainName;
	}//setDomainName

	public double getFeePerYear() 
	{
		return feePerYear;
	}//getFeePerYear

	public void setFeePerYear(double feePerYear) 
	{
		this.feePerYear = feePerYear;
	}//setFeePerYear

	@Override
	public double getTotalDue() 
	{
		return feePerYear;
	}//getTotalDue

	@Override
	public String toString() {
		return "The new domain: " + domainName + " will have an annual fee of:";
	}//toString

}//DomainNameRegistration Class
