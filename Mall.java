public class Mall{
	final String nameOfTheMall = "lulu";
	final String theRulesHaveToFollow = "notAllowed";
	final String shopName = "shreefashion";
    final char theFirstLetterOfMall = "m";
	final String aBuildingMustConstructWithCement = "bharati";
	byte noOfShops = 6;
	int noOfItems = 765;
	static float percentagePeopleVisitDaily = 65.65f;
    static String nameOfTheOwner = "sham";
	static String nameOfArchitecture = "arch"; 

	static int employesSalary = 30000;
	static String securityName = "udaya";
	int noOfEmployes = 543;
	int noOfShopkeeper = 876;
	String cosmeticsShopName = "lakme";
	String nameOfTheJewellaryShop = "malabar";
	static String gamesName= "chess";
	final int noOfFloorMallHave = 76;
	byte noOfTechnologyShopMallHave = 76;
	int noOfToyShopHave = 987;
	int noOfClothShopHave= 654;
	
	int noOfCameraMallHave;
	boolean isMallInProfitConditionOrloss;
	
	static String thing = new String("Dress");
	static String bikeName = new String("pulsar");
	
	public static void main(String []args){
		Mall spam = new Mall(cloths,malabar,sparx,);
		
		//methods
		String value = thing.toString();
		System.out.println(value);
		
		String  value1 = bikeName.intern();
		System.out.println(value1);
		
		boolean value2 = bikeName.endsWith();
		System.out.println(value2);
	
	}
	
		
}
enum Shop{
	CLOTHS("cloths"),JEWELLARY("jewellary"),SHOES("shoes"),CHAPPAL("chappal");
	String things;
	Shop(String things){
		this.things = things;
	}
	
}