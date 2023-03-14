public class ConstructorTest{
	public ConstructorTest(){
		
		super();
		System.out.println("default constructor");
	}
	public ConstructorTest(int num){
		this();
		System.out.println("parameterized constructor");
		
	}
	public ConstructorTest(float value){
		this(123);
		System.out.println("parameters constructor");
	}
	public ConstructorTest(String  name){
		this(30000);
		System.out.println("parameters with String");
	}
	public ConstructorTest(char letter){
		this(23.f);
		System.out.println("parameterized constructor with char");
	}
	public ConstructorTest(byte numb){
		this('a');
		System.out.println("parameters with byte value");
	}
	public static void main(String[] args){
		ConstructorTest obj = new ConstructorTest("gowri");
	}
	}  