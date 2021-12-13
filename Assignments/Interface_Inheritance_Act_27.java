// WAP Create an interface basic_animal wiht eat and sleep methods.
// Create a class monkey with jump and bite method.
// Create a class human extends monkey and implements basic_animal and show the activity of human class.

interface basic_animal {
    void eat();
    void sleep();
}

class monkey {
    void jump() {
        System.out.println("Monkey can jump.");
    }
    void bite() {
        System.out.println("Monkey can bite.");
    }
}

class human extends monkey implements basic_animal {
    public void eat () {
        System.out.println("Human can eat.");
    }
    public void sleep() {
        System.out.println("Human can sleep.");
    }
    public void jump() {
        System.out.println("Human can jump.");
    }
    public void bite() {
        System.out.println("Human can bite.");
    }
}


public class Interface_Inheritance_Act_27 {
    public static void main(String args[]) {
        monkey m = new monkey();
        human h = new human();
        
        m.jump();
        m.bite();
        h.eat();
        h.sleep();
        h.jump();
        h.bite();
    }    
}


//  OUTPUT

// Monkey can jump.
// Monkey can bite.
// Human can eat.  
// Human can sleep.
// Human can jump. 
// Human can bite.