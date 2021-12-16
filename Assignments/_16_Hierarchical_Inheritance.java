// 16) WAP to create a superclass building that stores the no. of floors, no. of bedrooms & total area. Create two deriveed classes from the bulding class with the following attributes.
// BHK2 - no. of bedroom, no. of bathroom, no. of floors & total area.
// BHK3 - no. of bedroom, no. of bathroom, no. of floors, no. of balcony & total area.

class Building{
    int f,b,a;
    Building(int x, int y, int z){
        f = x;
        b = y;
        a = z;
    }

    void display1(){
        System.out.println("No. of floors: " + f);
        System.out.println("No. of bedrooms: " + b);
        System.out.println("Total area: " + a);
        System.out.println("-----------------------------------");
    }
}

class BHK2 extends Building{
    int bh;
    BHK2(int x, int y, int z, int w){
        super(x, y, z);
        bh = w;
    }

    void display2(){
        System.out.println("No. of floors: " + f);
        System.out.println("No. of bedrooms: " + b);
        System.out.println("No. of bathrooms: " + bh);
        System.out.println("Total area: " + a);
        System.out.println("------------------------------------");
    }
}

class BHK3 extends Building{
    int bh, ba;
    BHK3(int x, int y, int z, int w, int u){
        super(x, y, z);
        bh = w;
        ba = u;
    }

    void display3(){
        System.out.println("No. of floors: " + f);
        System.out.println("No. of bedrooms: " + b);
        System.out.println("No. of bathrooms: " + bh);
        System.out.println("No. of balcony: " + ba);
        System.out.println("Total area: " + a);
        System.out.println("------------------------------------");
    }
}

public class _16_Hierarchical_Inheritance {
    public static void main(String args[]) {
        Building b1 = new Building(5, 8, 10);
        BHK2 b2 = new BHK2(7, 3, 16, 20);
        BHK3 b3 = new BHK3(1, 6, 26, 28, 31);

        b1.display1();
        b2.display2();
        b3.display3();
    }
}


// OUTPUT

// No. of floors: 5
// No. of bedrooms: 8
// Total area: 10
// -----------------------------------
// No. of floors: 7
// No. of bedrooms: 3
// No. of bathrooms: 20
// Total area: 16
// ------------------------------------
// No. of floors: 1
// No. of bedrooms: 6
// No. of bathrooms: 28
// No. of balcony: 31
// Total area: 26
// ------------------------------------