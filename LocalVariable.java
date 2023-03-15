public class LocalVariable{
	String name = "gowri";
	
	public static void main(String[]args){
		LocalVariable obj = new LocalVariable();
	}
		public LocalVariable(){
		  System.out.println("dafault constructor");
		
	}
	
	public LocalVariable(String name){
		  System.out.println("parameterized constructor this.name");
	}
	
}