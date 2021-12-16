// WAP to create a class college having a following details.
// a) College Name
// b) College Address
// c) College Code

// Create a class Department that inherits the class college.
// Department class also has the following properties.
// a) Department Name
// b) HOD Name

// Create another class student that inherits the Department class.
// Student class has also the following properties.

// a) Student Name
// b) Student Roll No.
// c) Degree of Student

class College 
{
	String cn;
	String ca;
	int cc;

	College(String a, String b,  int c) 
	{
		cn = a;
		ca = b;
		cc = c;
	}

	void show1() 
	{
		System.out.println("College name: " + cn);
		System.out.println("College address: " + ca);
		System.out.println("College code: " + cc);
	}
}

class Department extends College 
{
	String dn;
	String hod;
	Department (String a, String b, int c, String d, String e)
	{
		super(a,b,c);
		dn = d;
		hod = e;
	}

	void show2()
	{
		System.out.println("College name: " + cn);
		System.out.println("College address: " + ca);
		System.out.println("College code: " + cc);
		System.out.println("Department name: " + dn);
		System.out.println("HOD name: " + hod);
	}	
}

class Student extends Department
 {
	String sn;
	int roll;
	String ds;

	Student (String a, String b, int c, String d, String e, String f, int g, String h) 
	{
		super(a, b, c, d, e);
		sn = f;
		roll = g;
		ds = h;
	}

	void show3() 
	{
		System.out.println("College name: " + cn);
		System.out.println("College address: " + ca);
		System.out.println("College code: " + cc);
		System.out.println("Department name: " + dn);
		System.out.println("HOD name: " + hod);
		System.out.println("Student name: " + sn);
		System.out.println("Roll No: " + roll);
		System.out.println("Deg name: " + ds);
	}
}


public class _20_MultiLevel_Inheritance_College1 {
	public static void main(String args[]) 
	{
		College c = new College("BCREC", "Durgapur", 120);
		Department d = new Department("BCREC", "Durgapur", 120,"Computer Science and Engineering", "Prof. Chandan Koner");
		Student s = new Student("BCREC", "Durgapur", 120,"Computer Science and Engineering", "Prof. Chandan Koner","Aditya Kumar Singh", 9052, "B.Tech");
		
		c.show1();
		d.show2();
		s.show3();
	}
}


// OUTPUT

// College name: BCREC
// College address: Durgapur
// College code: 120
// College name: BCREC
// College address: Durgapur
// College code: 120
// Department name: Computer Science and Engineering
// HOD name: Prof. Chandan Koner
// College name: BCREC
// College address: Durgapur
// College code: 120
// Department name: Computer Science and Engineering
// HOD name: Prof. Chandan Koner
// Student name: Aditya Kumar Singh
// Roll No: 9052
// Deg name: B.Tech