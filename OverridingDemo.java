
class Animal {
    // method in the superclass
    public void eat() {
        System.out.println("I can eat");
    }
}

// Dog inherits Animal
class Dog extends Animal {
    // overriding the eat() method

    public void eat() {
        System.out.println("I eat dog food");
    }

    // new method in subclass
    public void bark() {
        System.out.println("I can bark");
    }
}

class OverridingDemo {
    public static void main(String[] args) {

        // create an object of the subclass
        Dog labrador = new Dog();
        Animal a1 = new Animal();

        // call the eat() method
        labrador.eat();
        a1.eat();
        labrador.bark();
    }
}
