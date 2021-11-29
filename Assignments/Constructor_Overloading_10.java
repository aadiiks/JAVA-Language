// 10) Write a Java Program to calculate the area and volume of a classroom using Constructor Overloading

class Classroom{
    int l, b, h, area, volume;
    Classroom(){
        l = 40;
        b = 30;
        h = 20;
    }

    Classroom (int x, int y, int z){
        x = l;
        y = b;
        z = h;
    }

    void CalArea(){
        area = l * b;
        System.out.println("Area: " + area);
    }
    
    void CalVolume(){
        volume = l * b * h;
        System.out.println("Volume: " + volume);
        
    }
}
public class Constructor_Overloading_10 {
    public static void main(String args[]) {
        Classroom c1 = new Classroom();
        Classroom c2 = new Classroom();

        c1.CalArea();
        c1.CalVolume();

        c2.CalArea();
        c2.CalVolume();
    }
}


// OUTPUT

// Area: 1200
// Volume: 24000
// Area: 1200
// Volume: 24000