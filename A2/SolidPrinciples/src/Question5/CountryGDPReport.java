package Question5;

// Idea is that..
//Countries with Agriculture
//Countrues with tourism

public class CountryGDPReport
{
	Country mexico;
	Country canada;

	public CountryGDPReport(Country c1,Country c2)
	{
            mexico=c1;
            canada=c2;
	}

	public void PrintCountryGDPReport()
	{
		System.out.println("GDP By Country:\n");
		System.out.println("- Canada:\n");
		System.out.println("   - Agriculture: " + canada.getAgriculture());
		System.out.println("   - Manufacturing: " + canada.getManufacturing());
		System.out.println("- Mexico:\n");
		System.out.println("   - Agriculture: " + mexico.getAgriculture());
		System.out.println("   - Tourism: " + mexico.getTourism());
	}
}