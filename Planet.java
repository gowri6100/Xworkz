public class Planet{
	
	
    NameOfThePlanet planetName;
	String hottestPlanet;
	int age;
	static String moriningPlanet;
	String colourOfThePlanet;
	String coolestPlanet;
	int noOfPlanet;
	String shapeOfThePlanet;
	char firstLetterOfThePlanet;
	
	public static void main(String[]args){
		
		Planet obj1 = new Planet(NameOfThePlanet.EARTH);
		
		System.out.println(obj1.planetName);
		
		
		
		
	}
	public Planet(NameOfThePlanet planetName){
		this.planetName=planetName;
	}
	
	
	
}
enum NameOfThePlanet{
	EARTH,SATURN,MERCURY,MOON,JUPITER,VENUS,MANGAL;
	
	
	
	
}