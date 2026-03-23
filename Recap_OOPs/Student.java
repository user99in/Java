public class Student{

	String name ;
	int marks ;

	Student(String name ,int marks){
		this.name = name;
		this.marks = marks;
	}

	void  show()
		{
			System.out.println("Student name "+name+ " and  marks "+marks);
		}
	 
 
     public static void main(String args[])
	{
		Student  stu = new Student("Surya",90);
		stu.show();
	}

}