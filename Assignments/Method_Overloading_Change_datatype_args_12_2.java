// 12.2) Write a Java Program to implement method overloading i) by changing the number of arguments and ii) by changing the data type of arguments.

public class Method_Overloading_Change_datatype_args_12_2 {
    public static void main(String args[]) {
    addover add1=new addover();
    double a=11.2;
    double b=11.3;
    double c=11.6;
    double x=add1.addition(a, b, c);
        System.out.println("The sum is "+x);
    }
}

class addover{
        
    int addition(int a,int b,int c){
        return a+b+c;
    }
    double  addition(double a,double b,double c){
        return a+b+c;
    }
}
