class Student{
    String name,dept;int roll;
    Student(String n,int id){
        name=n;
        roll=id;
    }
    void display(){
        System.out.println("Name="+name+"Roll="+roll);
    }

    Student(String n,int id,String d){
        name=n;
        roll=id;
        dept=d;
    }
    
    void display1(){
        System.out.println("Name="+name+"Roll="+roll+"Dept="+dept);
    }
}

class Student1{
    public static void main(String args[]){
        Student s1=new Student("Aditya Kumar Singh",52);
        Student s2=new Student("S",51,"CSE-1");
        s1.display();
        s2.display1();
    }
}