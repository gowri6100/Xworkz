public class ParametersTest{
	public static void main(String[]args){
		firstMethod (99);
		secondMethod (123,"harry");
		thirdMethod(99,'o',"jack");
		fourthMethod('d',654,12656);
		fifthMethod('s',"tiger",556565l);
		
	}
	
	public static int firstMethod(int numb){
	  System.out.println(numb);
	  return 10;
	}
	public static  int secondMethod(int num,String name){
		System.out.println(num);
		System.out.println(name);
		return 100;
	}
	public static byte thirdMethod(int nos,char vowel,String animal){
		System.out.println(nos);
		System.out.println(vowel);
		System.out.println(animal);
		return 'g';
	}
	public static char fourthMethod(char consonants,int numb,long num){
		System.out.println(consonants);
		System.out.println(numb);
		System.out.println(num);
		return 12;
	}
	public static char fifthMethod(char letter,String word,long num){
		System.out.println(letter);
		System.out.println(word);
		System.out.println(num);
		return 't';
	}
	
		
	
}