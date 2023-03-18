public class StaticMethodS{
	public static void main(String[]args){
		Method obj = new Method("gowri",65.76f,7.98d);
		
		System.out.println(obj.name);
		System.out.println(obj.percentage);
		System.out.println(obj.cgpa);
		
		System.out.println(Method.nameOfStudent);
		System.out.println(Method.rollNum);
		System.out.println(Method.USNNo);
		System.out.println(Method.elements);
		System.out.println(Method.noOfStudent);
		
		Method.call();
		Method.run();	
	}
	public static class Method{
		static String nameOfStudent;
		static byte rollNum;
		static int USNNo;
		static char elements;
		static short noOfStudent;
		
        String name;
		float percentage;
		double sgpa;
		
		static{ 
			nameOfStudent = "gagna";
			rollNum = 48;
			USNNo = 765;
			elements = 'j';
			noOfStudent = 2345;
		}
		public Method (){
			System.out.println("default constructor");
		}
		public Method (String name,float percentage,double cgpa){
			this.name = name;
			this.percentage = percentage;
			this.cgpa = cgpa;
			System.out.println("parametrized constructor");
		
		}
		public static void call(){
			System.out.println("calling the static Method");
		}
		public static void run(){
			System.out.println("calling the static second Method");
				
			
		}
	}
	
}