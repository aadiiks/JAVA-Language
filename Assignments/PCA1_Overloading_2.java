// 2) Write a Java Program to show the name, roll no., and department of a student using constructor overloading.

class Student_Details{
    String name, dept;
    int roll;

    Student_Details(String full_name, int roll_no){
        name = full_name;
        roll = roll_no;
        System.out.println("Name = " + name + "\tRoll = " + roll + "\n");
    }

    Student_Details(String full_name, int roll_no, String department){
        name = full_name;
        roll = roll_no;
        dept = department;
        System.out.println("Name = " + name + "\tRoll = " + roll + "\tDepartment = " + dept + "\n");
    }

}

public class PCA1_Overloading_2{
    public static void main(String args[]) {
        Student_Details s1 = new Student_Details("ADITYA KUMAR SINGH", 52);
        Student_Details s2 = new Student_Details("ADITYA KUMAR SINGH", 52, "CSE");
    }
}


// OUTPUT

// Name = ADITYA KUMAR SINGH       Roll = 52

// Name = ADITYA KUMAR SINGH       Roll = 52       Department = CSE