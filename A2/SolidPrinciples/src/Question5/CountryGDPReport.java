package Question5;

// Idea is that..
//Countries with Agriculture
//Countrues with tourism

public class CountryGDPReport
{
    AgrManufacturing country1;
    AgrAndTourism country2;
    
	public CountryGDPReport()
	{
            
            country1=CountryFactory.getCanadaGDPObject();
            country2=CountryFactory.getMexcoGDPObject();;
	}

	public void PrintCountryGDPReport()
	{
		System.out.println("GDP By Country:\n");
		System.out.println("- Canada:\n");
		System.out.println("   - Agriculture: " + country1.getAgriculture());
		System.out.println("   - Manufacturing: " + country1.getManufacturing());
		System.out.println("- Mexico:\n");
		System.out.println("   - Agriculture: " + country2.getAgriculture());
		System.out.println("   - Tourism: " + country2.getTourism());
	}
}