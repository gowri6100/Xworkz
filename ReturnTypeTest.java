public class ReturnTypeTest{
	public static void main(String[]args){
	byte result = numByte();
    System.out.println(result);
	
	int outcome = numbint();
	System.out.println(outcome);
	
	char outs = letter();
	System.out.println(outs);
	
	String word = group();
	System.out.println(word);
	
	float results = outcome();
	System.out.println(results);

	
	}
	public static byte numByte(){
		byte num = 25;
		return 65;	
	}
	public static int numbint(){
		int numb = 654;
		return 543;
	}
	public static char letter(){
	char letter = 'h';
		return 'h';
	}
	public static String group(){
		String name = "harry";
		return "jack";
	}
	public static float outcome(){
	float percenatge = 65.65f;
		
		return 54.65f;
	}
	
	
}