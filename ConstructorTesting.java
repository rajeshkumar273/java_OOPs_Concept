public class ConstructorTesting{

	int modelYear;

	String modelName;

	public ConstructorTesting(int year, String name) {

	modelYear=year;
	modelName=name;

	}

	public static void main(String args[]) {


	ConstructorTesting obj=new ConstructorTesting(2021,"Maruthi");
	
	System.out.println(obj.modelYear);
	System.out.println(obj.modelName);


	}

}
