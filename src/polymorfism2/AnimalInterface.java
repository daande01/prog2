/**
 * 
 */
package polymorfism2;

interface AnimalInterface {
    String getName();
    String makeSound();
}
 
abstract class Animal implements AnimalInterface {
    private final String name;
 
    protected Animal(String name) {
        this.name = name;
    }
 
    public String getName() {
        return this.name;
    }
 
    public String makeSound() {
        return "";
    }
}
 
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
 
    @Override
    public String makeSound() {
        return "Meooow";
    }
}
 
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    
    @Override
    public String makeSound() {
        return "Woof! Woof!";
    }
}
 
