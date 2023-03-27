public class Results{
	//declaration
	
	static Result pass;
	static String fail;
	float percentage;
	char grade;
	double cgpa;
	public static void main(String []args){
		//created obj here
		Results obj = new Results(Result.FIRSTCLASS,fail,45.6f,'a',65.43d);
		System.out.println( Results.pass.aggregate);
		System.out.println( Results.fail);
		System.out.println( obj.percentage);
		System.out.println( obj.grade);
		System.out.println( obj.cgpa);
		
	}
	public Results(Result pass,String fail,float percentage,char grade,double cgpa){
		this.pass=pass;
		this.fail=fail;
		this.percentage=percentage;
		this.grade=grade;
		this.cgpa=cgpa;
		
	}
	
	
}
//creating enum class
enum Result{
	DISTICTION("distn"),FIRSTCLASS("frstcls"),SECONDCLASS("scndcls"),PASS("ps"),FAIL("fil");
	String aggregate;
	Result(String aggregate){
		this.aggregate=aggregate;
		
	}

	
}