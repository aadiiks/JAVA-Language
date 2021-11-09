// 13) Write a Java Program to implement method overloading to calculate the area of a triangle, circle, square, and cylinder

class cal{
    double calculate(int b,int h){
        return (double)(b*h/2);
    }
    
    double calculate(double pi,double r){
        return pi*r*r;
    }
    double calculate(double a){
       return (a*a);
    }
    double calculate(double pi,double a,double b){
        return pi*a*a*b;
    }
}

public class Method_Overloading_Calc_Area_13 {
    public static void main(String args[]) {
        cal c1=new cal();
        double p=c1.calculate(3, 4);
        double q=c1.calculate(3.14, 6);
        double r =c1.calculate(4);
        double s=c1.calculate(3.14, 5, 6);
        
        System.out.println("The area of a triangle "+p+"\n The area of square is  "+r+"\n The area of circle is "+q+"\n The area of cylinder is "+s);   
    }
}