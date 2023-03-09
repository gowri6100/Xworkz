public class Parameters{
	public static void main(String[] args){
		firstMethod(10);
		
	   secondMethod(1000,"gowri");
	   
	   thirdMethod(30000,"marana",65.876f);
	   
	   fourthMethod(1584,87.8765d,"dog",'a');
		
	}
	
	
	public static int firstMethod(int num){
		System.out.println(5);
		return 1000;
	}
	
	public static short secondMethod(int num,String name){
		System.out.println(num);
		System.out.println(name);
		return 2000;
	}
	
	public static char thirdMethod(int salary,String novel,float result){
		System.out.println(salary);
		System.out.println(novel);
		System.out.println(result);
		return 'a';
	}
	
	public static String fourthMethod(long carNum,double percent,String animal,char vowel){
	    System.out.println(carNum);
		System.out.println(percent);
		System.out.println(animal);
		System.out.println(vowel);
		return "ganaga";
		
	}	
}