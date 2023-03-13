public class ConstructorChaining{

	public ConstructorChaining(){
		super();
		System.out.println("deafault constructor");
		
	}
	public ConstructorChaining(int num ){
	this();
		System.out.println("parametarized constructor");
	}
	public ConstructorChaining(String name){
		this('a');
		System.out.println("parametarized constructor with String");
	}
	public ConstructorChaining(float numb){
		this (123);
       System.out.println("parametarized constructor with float");
	}
	public ConstructorChaining(char element){
		this(23.765f);
		System.out.println("parametarized constructor with char");
	}
	
	public static void main(String[] args){
	
		ConstructorChaining obj = new ConstructorChaining("ganga");
		
	}
	
}