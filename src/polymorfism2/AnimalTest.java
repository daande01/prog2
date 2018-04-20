/**
 * 
 */
package polymorfism2;

public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animals = {
            new Cat("Clover"),
            new Cat("Catzilla"),
            new Dog("Dazzler"),
            new Dog("Dreamweaver")
            
        };
 
        for (Animal animal : animals) {
            System.out.println(animal.getName() + ": " + animal.makeSound());
            
            
            
            // polymorphism – i programmering: det att en och samma instruktion 
            // i ett programspråk kan utföras på olika sätt. Vilket sätt som väljs 
            //avgörs av sammanhanget.
            // dynamisk bindning är ett verktyg for att uppnå polymorfism
        }
    }
}

/*
 * 
 * Polymorfism inom biologi innebär att det inom samma population
 *  av en art finns två eller flera distinkta varianter, morfer.
 * objektetets klass styr vilken metod som skall anropas inte 
 * referensens typ.
 *  Polymorphism just means that different objects can 
 *  respond to the same message(method) in different ways.
 * 
 * en klass är polymorfisk om om frågan "är en" ger mer än ett svar
 *
 * ex en jframe är en container 
 *    en jframe är en component
 *    en jframe är en object
 * 
 * 
 * polymorphism – i programmering: det att en och samma instruktion 
 * i ett programspråk kan utföras på olika sätt. Vilket sätt som väljs 
 * avgörs av sammanhanget. – Termen används främst inom objekt­orien­te­rad
 *  pro­gram­mering, och innebär där att en och samma metod utförs på olika sätt 
 *  i olika klasser av objekt. Detta är möjligt i objektorienterade program därför
 *   att koden som beskriver hur ett anrop ska utföras ingår i objektet, inte i anropet.
 *    Anropet anger bara namnet på metoden och vilka argument som ingår. – 
 *    
 *    
 *    Metoder som har samma namn men olika signatur (t. ex olika antal parametrar eller olika
typer på sina parametrar) sägs överlagra (eng: overload) varandra. Det är tillåtet att ha flera
överlagrade metoder i samma klass. Överlagring inträffar också om en klass har en metod med
samma namn men olika signatur som någon metod i en super- eller subklass.

The binding which can be resolved at compile time by compiler is known as static or early binding. 
All the static, private and final methods have always been bonded at compile-time . Why binding of Static, 
final and private methods is always a static binding? You would understand it better after reading dynamic 
binding. Still let me explain this – Compiler knows that all such methods cannot be overridden and will
 always be accessed by object of local class. Hence compiler doesn’t have any difficulty to determine object 
 of class (local class for sure). That’s the reason binding for such methods is static.

Dynamic Binding or Late Binding

When compiler is not able to resolve the call/binding at compile time, such binding is known as Dynamic or late Binding.
 Overriding is a perfect example of dynamic binding as in overriding both parent and child classes have same method.
  Thus while calling the overridden method, the compiler gets confused between parent and child class
   method(since both the methods have same name).

– Tidig (statisk) bindning (early eller static coupling) innebär att de två kompo­nent­erna 
(klasserna i objekt­oriente­rad programme­ring) knyts till varandra när pro­gram­met kompi­leras.
 Om kompo­nent A behöver en tjänst av en viss typ är det då bestämt en gång för alla att kompo­nent B 
 ska till­handa­hålla den typen av tjänst. Det gör pro­grammet snabbt, men omöjligt att ändra såvida 
 man inte skriver om käll­koden och kompi­lerar om program­met. – Sen (dynamisk) bindning 
 (late eller dynamic binding) innebär att komponent­erna knyts till varandra först när program­met körs.
  Fördelen med det är att program­men kan göras om av använd­arna genom att komponent­erna kombi­neras på 
  olika sätt. Det kräver ingen omkompile­ring. Nack­delen är att det tar längre tid;
  
  Static binding happens at compile-time while dynamic binding happens at runtime.
Binding of private, static and final methods always happen at compile time since these methods cannot be overridden. Binding of overridden methods happen at runtime.
Java uses static binding for overloaded methods and dynamic binding for overridden methods.
 
 *
 *Abstract classes are an excellent way to create planned inheritance hierarchies. 
 *
 *
 *The abstract class inheritance is used when the derived class shares the core properties and behaviour of the abstract class. The kind of behaviour that actually defines the class.

On the other hand interface inheritance is used when the classes share peripheral behaviour, ones which do not necessarily define the derived class.

For eg. A Car and a Truck share a lot of core properties and behaviour of an Automobile abstract class, but they also 
share some peripheral behaviour like Generate exhaust which even non automobile classes like Drillers or 
PowerGenerators share and doesn't necessarily defines a Car or a Truck, so Car, Truck, Driller and 
PowerGenerator can all share the same interface IExhaust.
 *
 *
 */