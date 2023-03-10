public class MethodOverloading{
	public static void main(String[]args){
		
		cell();
	
		byte value = 100;
		
		run(value);
		
		go(67,value,"gagan");
	
	}
	public static void cell(){
	System.out.println("calling first method");
	}
	public static void cell(int mark){
		System.out.println("calling second method");
	}
	public static void cell(int price,String name){
		System.out.println("put it first");
	}
	public static int cell(String name,int num){
		System.out.println("put it second");
		return num;
	}
	public static void cell(float percentage){
		System.out.println("put it third");
	}
	public static void run(byte num){
		System.out.println("get it fast");
	}
	public static void run(int num){
		System.out.println("run fast");
		}
		public static void run(String name){
			System.out.println("hurry");	
		}
		public static void run(boolean question){
			System.out.println("isItOrNot");
		}
		public static void run(int num,String name){
			System.out.println("long");
			
		}
		public static String go(int num,String name){
			System.out.println("lowes Number is 1");
			return "namami";
		}
		public static String go(String name,int num){
			System.out.println(" Number is 1");
			return "nami";
		}
		public static String go(String name,int num,byte number){
			System.out.println(" Number is 2");
			return "namimi";
		}
		public static int go(byte num,String name,int number){
			System.out.println(" Number is 8");
			return 76;
			
		}
		public static int go(int number,byte nos,String name){
			System.out.println(" Number is 9");
			return 67;
		}
					
}