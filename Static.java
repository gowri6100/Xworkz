public class Static{
	public static void main(String []args){
		
		variable obj = new variable();
		
		obj.mall = "asian mall";
		obj.letter = 'j';
		obj.marks = 100;
		obj.percentage = 89.765f;
		obj.num = 100;
		
	    System.out.println(obj.mall);
		System.out.println(obj.letter);
		System.out.println(obj.marks);
		System.out.println(obj.percentage);
		System.out.println(obj.num);
		
		variable.mobileNumber = 34565324;
		variable.isBangloreWeatherIsCoolOrNot = true;
		variable.elements = 'i';
		variable.percentages = 76.65d;
		variable.village = "afzalpura";
		
		
		System.out.println(variable.mobileNumber);
		System.out.println(variable.isBangloreWeatherIsCoolOrNot);
		System.out.println(variable.elements);
		System.out.println(variable.percentages);
		System.out.println(variable.village);
		
	
	}
	public static class variable{
		String mall;
		char letter;
		int marks;
		float percentage;
		byte num;
		
		static long mobileNumber;
		static boolean isBangloreWeatherIsCoolOrNot;
		static char elements;
		static double percentages;
		static String village;
		
	}
	
 
}