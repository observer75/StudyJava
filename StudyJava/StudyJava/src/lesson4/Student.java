package lesson4;

public class Student {
	private int Age;
	private String Name;
	private boolean Married;
	
	Student(int Age, String Name, boolean Married){
		this.Age = Age;
		this.Name = Name;
		this.Married = Married;
	}
	
	public void getStudentAge() {
		System.out.println(Age);
	}
	
	public void getStudentName() {
		System.out.println(Name);
	}
	
	public void getStudentMaritalStatus(){
		System.out.println(Married);
	}

}
