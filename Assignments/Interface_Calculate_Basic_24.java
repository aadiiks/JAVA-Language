// WAP to define an interface calculator
// Compute addition, substraction, product and division.

interface calculator {
    int calculation(int a, int b);
}
class add implements calculator {
public int calculation(int a, int b){
     return a+b;
}
}
class Sub implements calculator {
public int calculation(int a, int b){
     return a-b;
}
}
class Multiply implements calculator {
public int calculation(int a, int b){
     return a*b;
}
}
class Divide implements calculator {
public int calculation(int a, int b){
return a/b;
}
}

class Interface_Calculate_Basic_24 {
public static void main(String args[]) {
add a = new add();
Sub b = new Sub ();
Multiply c = new Multiply ();
Divide d = new Divide ();

System.out.println("Addition : " + a.calculation(10,20));
System.out.println("Subtraction : " + b.calculation(10,20));
System.out.println("Multiplication : " + c.calculation(10,20));
System.out.println("Divide : " + d.calculation(20,10));
}
}

// OUTPUT

// Addition : 30
// Subtraction : -10   
// Multiplication : 200
// Divide : 2