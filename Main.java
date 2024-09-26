interface Animal {
    //abstract methods (no body to method) (all required to be implemented)
    //implicitly public 
    //if method is private in an interface then cannot be accessd by other classes implementing interface 
    //default methods don't need to be overriden but can be and private methods can be added here 
    //interfaces cannot have instance vars but can have int NUMBER_OF_LEGS = 4; (implicitly public static final (static - shared by class final - cannot be changed))

    void makeSound(); 
    void eat(); 
}

class Dog implements Animal {

    //when you use the @Override annotation the java compiler will check if your method signature matches 
    // the signature of a method in an interface or a superclass. it's an additional check because if it doesn't 
    //and you dont use @Override then itll treat as a new method which could introduce bugs 

    @Override
    public void makeSound() {
        System.out.println("Dog says woof woof");
    }

    @Override
    public void eat() {
        System.out.println("Dog is Eating");
    }


}

class Cat implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Cat says meow meow");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog(); 
        Animal cat = new Cat(); 

        dog.makeSound();
        dog.eat();

        cat.makeSound();
        cat.eat();
    }
}