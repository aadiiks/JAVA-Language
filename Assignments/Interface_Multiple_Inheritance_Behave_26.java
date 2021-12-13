// WAP to implement multiple inheritance using interface.

// Create 2 interface animal eat & animal travel.

// Within 1st interface create a method eat.
// Within 2nd interface create a method travel.

// Create a class animal which implements both the interface and both show the activity of the methods.

// Hint: class Animal implements animal_eat, animal_travel.

interface animal_eat {
    void eat();
}

interface animal_travel {
    void travel();
}

class animal implements animal_eat, animal_travel {
    public void eat() {
        System.out.println("Animal eat flesh.");
    }
    public void travel(){
        System.out.println("Animal travel in jungle.");
    }    
}

public class Interface_Multiple_Inheritance_Behave_26 {
    public static void main(String args[]) {
        animal a = new animal();
        a.eat();
        a.travel();
    }
}

// OUTPUT

// Animal eat flesh.
// Animal travel in jungle.