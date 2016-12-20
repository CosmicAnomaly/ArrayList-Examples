package Lab8;
import java.util.ArrayList;
import java.text.NumberFormat;

public class Driver 
{

	public static void main(String[] args) 
	{
		ArrayList<Payable> payableList = new ArrayList<Payable>();
		
		LegalServicesBill legalServicesBillOne = new LegalServicesBill("The Java Case", "459601F", 200, 90.00, 10000.00, false);
		DomainNameRegistration domainNameRegistrationOne = new DomainNameRegistration("www.MyNewWebsite.com", 120.00);
		SoftwareLicense softwareLicenseOne = new SoftwareLicense("My New Game", "KKDK-6787-K2S1", 59.99, 2);
		
		payableList.add(legalServicesBillOne);
		payableList.add(domainNameRegistrationOne);
		payableList.add(softwareLicenseOne);
		
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		for(int count = 0; count < payableList.size(); count++)
		{
			System.out.print(payableList.get(count));
			System.out.print(" " + money.format(payableList.get(count).getTotalDue())+ "\n");
			System.out.println();
		}//for loop

	}//Main

}//Driver Class
