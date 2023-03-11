public class ConstructorProgram{
	public ConstructorProgram(){
		
		System.out.println("constructor from  ConstructorProgram class");
	}
	public ConstructorProgram(String name){
		System.out.println("parameterized constructor");
		
	}
	public ConstructorProgram(int num){
		System.out.println("print the number");
	}
		
		
		public ConstructorProgram(char letter){
		System.out.println("first letter of gowri");
		}
		public ConstructorProgram(short number){
		System.out.println("salary");
		}
	
	
	public static void main(String[]args){
		 ConstructorProgram  obj = new ConstructorProgram();

		 ConstructorProgram  name = new ConstructorProgram("radha");
		 ConstructorProgram  num = new ConstructorProgram(100);
		 ConstructorProgram  letter = new ConstructorProgram('g');
		 ConstructorProgram  number = new ConstructorProgram(30000);
		 
		 
		 
		
	}
	
}
		
