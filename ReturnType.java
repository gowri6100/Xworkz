public class ReturnType{
	public static void main(String[]args){
	byte result = numByte();
    System.out.println(result);
	
    short res = giveShort();
	System.out.println(res);	
	
	int money = wantSalary();
	System.out.println(money);
	
	long number = phoneNumber();
    System.out.println(number);	
	
	float results = numOfStudents();
	System.out.println(results);
	
	double karnataka = literacy();
	System.out.println(karnataka);
	
	char a = name();
    System.out.println(a);
	
	boolean answer = statement();
	System.out.println(answer);
	
	String name = coName();
	System.out.println(name);	
			
	}
	
	public static byte numByte(){
		byte num = 25;
		return num;	
	}
	
	public static short giveShort(){
		short value = 1000;
		return value;
	}
	
	public static int wantSalary(){
		int salary = 30000;
		return salary;
	}
	public static long phoneNumber(){
		long callNum = 124763773;
		return callNum;
	}
	public static float numOfStudents(){
		float percentage = 65.764f;
		return percentage;
	}
	public static double  literacy(){
		double percnt = 75.678827d;
		return 75.678827d;
	}
	
	public static char name(){
		char nameOfTheGirl = 'g';
		return nameOfTheGirl;
	}
	public static boolean statement(){
		boolean question = true;
		return question;
	}
	
	public static String coName(){
		String companyName = "Bosch";
		return companyName;
	}
}