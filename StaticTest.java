<<<<<<< HEAD
public class StaticTest{
	String collegeName;
	byte noOfStudent;
	int feePerStudent;
	String studentName;
	byte rollNo;
	char firstLetterOfStudent;
	float percentage;
	double cgpa;
	short fee;
	long USNNo;
	
	public StaticTest(){
		System.out.println("default constructor");
	}
	public StaticTest(String collegeName){
		this.collegeName =  collegeName; 
		System.out.println("parameterized constructor");
	}
	public StaticTest(String collegeName,byte noOfStudent){
		this.collegeName =  collegeName;
		this.noOfStudent=  noOfStudent;		
		System.out.println("print collegeName ,noOfStudent");
	}
	public StaticTest(String collegeName,byte noOfStudent,int feePerStudent){
		this.collegeName =  collegeName;
		this.noOfStudent =  noOfStudent;
		this.feePerStudent =  feePerStudent;
		System.out.println("feePerStudent");
	}
	public StaticTest(String collegeName,byte noOfStudent,int feePerStudent,String studentName){
		this.collegeName =  collegeName;
		this.noOfStudent =  noOfStudent;
		this.feePerStudent =  feePerStudent;
		this.studentName =  studentName;
		System.out.println("print collegeName ,noOfStudent, feePerStudent,String studentName");
	}
	public StaticTest(String collegeName,byte noOfStudent,int feePerStudent,String studentName,byte rollNo){
		this.collegeName = collegeName;
		this.noOfStudent = noOfStudent;
		this.feePerStudent = feePerStudent;
		this.studentName = studentName;
		this.rollNo = rollNo;
		System.out.println("byte rollNo");
	}
	
	public StaticTest(String collegeName,byte noOfStudent,int feePerStudent,String studentName,byte rollNo,	char firstLetterOfStudent){
		this.collegeName =  collegeName;
		this.noOfStudent =  noOfStudent;
		this.feePerStudent =  feePerStudent;
		this.studentName =  studentName;
		this.rollNo = rollNo;
		this.firstLetterOfStudent  = firstLetterOfStudent;
		System.out.println("char firstLetterOfStudent");
	}
	public StaticTest(String collegeName,byte noOfStudent,int feePerStudent,String studentName,byte rollNo,	char firstLetterOfStudent,float percentage){
		this.collegeName =  collegeName;
		this.noOfStudent =  noOfStudent;
		this.feePerStudent =  feePerStudent;
		this.studentName =  studentName;
		this.rollNo = rollNo;
		this.firstLetterOfStudent  = firstLetterOfStudent;
		this.percentage = percentage;
		System.out.println("float percentage");
	}
	public StaticTest(String collegeName,byte noOfStudent,int feePerStudent,String studentName,byte rollNo,	char firstLetterOfStudent,float percentage,double cgpa){
		this.collegeName =  collegeName;
		this.noOfStudent =  noOfStudent;
		this.feePerStudent = feePerStudent;
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.firstLetterOfStudent  = firstLetterOfStudent;
		this.percentage = percentage;
		this.cgpa =  cgpa;
		System.out.println("double cgpa");
	}
	public StaticTest(String collegeName,byte noOfStudent,int feePerStudent,String studentName,byte rollNo,	char firstLetterOfStudent,float percentage,double cgpa,short fee){
		this.collegeName =  collegeName;
		this.noOfStudent =  noOfStudent;
		this.feePerStudent =  feePerStudent;
		this.studentName =   studentName;
		this.rollNo = rollNo;
		this.firstLetterOfStudent  =  firstLetterOfStudent;
		this.percentage =  percentage;
		this.cgpa =  cgpa;
		this.fee =  fee;
		System.out.println("short fee");
	}
	public StaticTest(String collegeName,byte noOfStudent,int feePerStudent,String studentName,byte rollNo,	char firstLetterOfStudent,float percentage,double cgpa,short fee,long USNNo){
		this.collegeName =  collegeName;
		this.noOfStudent =  noOfStudent;
		this.feePerStudent =  feePerStudent;
		this.studentName =  studentName;
		this.rollNo =  rollNo;
		this.firstLetterOfStudent  = firstLetterOfStudent;
		this.percentage =  percentage;
		this.cgpa =  cgpa;
		this.fee = fee;
		this.USNNo = USNNo;
		System.out.println("print USNNo");
	}
	public static void main(String []args){
		StaticTest obj = new StaticTest();
		StaticTest obj1 = new StaticTest("sharanbasva university");
		StaticTest obj2 = new StaticTest("sharanbasva university,123");
		StaticTest obj3 = new StaticTest("sharanbasva university,123,10000");
		StaticTest obj4 = new StaticTest("sharanbasva university,123,10000,anu");
		StaticTest obj5 = new StaticTest("sharanbasva university,123,10000,anu,23");
		StaticTest obj6 = new StaticTest("sharanbasva university,123,10000,anu,23,'w'");
		StaticTest obj7 = new StaticTest("sharanbasva university,123,10000,anu,23,'w',34.56,");
		StaticTest obj8= new StaticTest("sharanbasva university,123,10000,anu,23,'w',34.56,45.76");
		StaticTest obj9= new StaticTest("sharanbasva university,123,10000,anu,23,'w',34.56,45.76,30000");
		StaticTest obj10= new StaticTest("sharanbasva university,123,10000,anu,23,'w',34.56,45.76,30000,34");
	
	}
=======
public class StaticTest{
	String collegeName;
	byte noOfStudent;
	int feePerStudent;
	String studentName;
	byte rollNo;
	char firstLetterOfStudent;
	float percentage;
	double cgpa;
	short fee;
	long USNNo;
	
	public StaticTest(){
		System.out.println("default constructor");
	}
	public StaticTest(String collegeName){
		this.collegeName =  collegeName; 
		System.out.println("parameterized constructor");
	}
	public StaticTest(String collegeName,byte noOfStudent){
		this.collegeName =  collegeName;
		this.noOfStudent=  noOfStudent;		
		System.out.println("print collegeName ,noOfStudent");
	}
	public StaticTest(String collegeName,byte noOfStudent,int feePerStudent){
		this.collegeName =  collegeName;
		this.noOfStudent =  noOfStudent;
		this.feePerStudent =  feePerStudent;
		System.out.println("feePerStudent");
	}
	public StaticTest(String collegeName,byte noOfStudent,int feePerStudent,String studentName){
		this.collegeName =  collegeName;
		this.noOfStudent =  noOfStudent;
		this.feePerStudent =  feePerStudent;
		this.studentName =  studentName;
		System.out.println("print collegeName ,noOfStudent, feePerStudent,String studentName");
	}
	public StaticTest(String collegeName,byte noOfStudent,int feePerStudent,String studentName,byte rollNo){
		this.collegeName = collegeName;
		this.noOfStudent = noOfStudent;
		this.feePerStudent = feePerStudent;
		this.studentName = studentName;
		this.rollNo = rollNo;
		System.out.println("byte rollNo");
	}
	
	public StaticTest(String collegeName,byte noOfStudent,int feePerStudent,String studentName,byte rollNo,	char firstLetterOfStudent){
		this.collegeName =  collegeName;
		this.noOfStudent =  noOfStudent;
		this.feePerStudent =  feePerStudent;
		this.studentName =  studentName;
		this.rollNo = rollNo;
		this.firstLetterOfStudent  = firstLetterOfStudent;
		System.out.println("char firstLetterOfStudent");
	}
	public StaticTest(String collegeName,byte noOfStudent,int feePerStudent,String studentName,byte rollNo,	char firstLetterOfStudent,float percentage){
		this.collegeName =  collegeName;
		this.noOfStudent =  noOfStudent;
		this.feePerStudent =  feePerStudent;
		this.studentName =  studentName;
		this.rollNo = rollNo;
		this.firstLetterOfStudent  = firstLetterOfStudent;
		this.percentage = percentage;
		System.out.println("float percentage");
	}
	public StaticTest(String collegeName,byte noOfStudent,int feePerStudent,String studentName,byte rollNo,	char firstLetterOfStudent,float percentage,double cgpa){
		this.collegeName =  collegeName;
		this.noOfStudent =  noOfStudent;
		this.feePerStudent = feePerStudent;
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.firstLetterOfStudent  = firstLetterOfStudent;
		this.percentage = percentage;
		this.cgpa =  cgpa;
		System.out.println("double cgpa");
	}
	public StaticTest(String collegeName,byte noOfStudent,int feePerStudent,String studentName,byte rollNo,	char firstLetterOfStudent,float percentage,double cgpa,short fee){
		this.collegeName =  collegeName;
		this.noOfStudent =  noOfStudent;
		this.feePerStudent =  feePerStudent;
		this.studentName =   studentName;
		this.rollNo = rollNo;
		this.firstLetterOfStudent  =  firstLetterOfStudent;
		this.percentage =  percentage;
		this.cgpa =  cgpa;
		this.fee =  fee;
		System.out.println("short fee");
	}
	public StaticTest(String collegeName,byte noOfStudent,int feePerStudent,String studentName,byte rollNo,	char firstLetterOfStudent,float percentage,double cgpa,short fee,long USNNo){
		this.collegeName =  collegeName;
		this.noOfStudent =  noOfStudent;
		this.feePerStudent =  feePerStudent;
		this.studentName =  studentName;
		this.rollNo =  rollNo;
		this.firstLetterOfStudent  = firstLetterOfStudent;
		this.percentage =  percentage;
		this.cgpa =  cgpa;
		this.fee = fee;
		this.USNNo = USNNo;
		System.out.println("print USNNo");
	}
	public static void main(String []args){
		StaticTest obj = new StaticTest();
		StaticTest obj1 = new StaticTest("sharanbasva university");
		StaticTest obj2 = new StaticTest("sharanbasva university,123");
		StaticTest obj3 = new StaticTest("sharanbasva university,123,10000");
		StaticTest obj4 = new StaticTest("sharanbasva university,123,10000,anu");
		StaticTest obj5 = new StaticTest("sharanbasva university,123,10000,anu,23");
		StaticTest obj6 = new StaticTest("sharanbasva university,123,10000,anu,23,'w'");
		StaticTest obj7 = new StaticTest("sharanbasva university,123,10000,anu,23,'w',34.56,");
		StaticTest obj8= new StaticTest("sharanbasva university,123,10000,anu,23,'w',34.56,45.76");
		StaticTest obj9= new StaticTest("sharanbasva university,123,10000,anu,23,'w',34.56,45.76,30000");
		StaticTest obj10= new StaticTest("sharanbasva university,123,10000,anu,23,'w',34.56,45.76,30000,34");
	
	}
>>>>>>> f66cbd28263c23a0e856d3b670dc6f10debf3bee
}