package Lab8;

public class SoftwareLicense implements Payable
{

	String softwareName;
	String softwareRegistrationKey;
	double pricePerKey;
	int totalNumberOfKeys;
	
	
	
	public SoftwareLicense(String softwareName, String softwareRegistrationKey, double pricePerKey,
			int totalNumberOfKeys) 
	{
		super();
		this.softwareName = softwareName;
		this.softwareRegistrationKey = softwareRegistrationKey;
		this.pricePerKey = pricePerKey;
		this.totalNumberOfKeys = totalNumberOfKeys;
	}//Constructor

	public String getSoftwareName() 
	{
		return softwareName;
	}//getSoftwareName

	public void setSoftwareName(String softwareName) 
	{
		this.softwareName = softwareName;
	}//setSoftwareName

	public String getSoftwareRegistrationKey() 
	{
		return softwareRegistrationKey;
	}//getSoftwareRegistrationKey

	public void setSoftwareRegistrationKey(String softwareRegistrationKey) 
	{
		this.softwareRegistrationKey = softwareRegistrationKey;
	}//setSoftwareRegistrationKey

	public double getPricePerKey() 
	{
		return pricePerKey;
	}//getPricePerKey

	public void setPricePerKey(double pricePerKey) 
	{
		this.pricePerKey = pricePerKey;
	}//setPricePerKey

	public int getTotalNumberOfKeys() 
	{
		return totalNumberOfKeys;
	}//getTotalNumberOfKeys

	public void setTotalNumberOfKeys(int totalNumberOfKeys) 
	{
		this.totalNumberOfKeys = totalNumberOfKeys;
	}//setTotalNumberOfKeys

	@Override
	public double getTotalDue() 
	{
		// TODO Auto-generated method stub
		return (totalNumberOfKeys * pricePerKey);
	}//getTotalDue

	@Override
	public String toString() {
		return "Software ordered: " + softwareName + " || Registration Key: " + softwareRegistrationKey
				+ " || Total number of keys being ordered: " + totalNumberOfKeys + " || Total due:";
	}//toString

}//SoftwareLicense Class
