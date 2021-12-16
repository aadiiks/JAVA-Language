// 18) WAP to implement method overloading by changing the no. of arguments & datatypes of argument to calculate the area of circle & cylinder.

class figure{
    void area(){
        System.out.println("No area");
    }

    void area(int r){
        double P;
        P = 3.14*r*r;
        System.out.println("Area of Circle is: " + P);
    }
    void area(int a, int b){
        double C;
        C = 3.14*a*a*b;
        System.out.println("Lateral surface area of cylinder is: " + C);
    }
}

public class _18_Overloading_Calc_Area {
    public static void main(String args[]){
        figure f1=new figure();
        f1.area();
        f1.area(2);
        f1.area(3,4);
    }
}


// OUTPUT

// No area
// Area of Circle is: 12.56
// Lateral surface area of cylinder is: 113.03999999999999