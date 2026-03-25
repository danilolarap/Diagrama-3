public class Dog extends Mammal {

    // Al igual que en Cat, pasamos el nombre a la superclase Mammal
    public Dog(String name) {
        super(name);
    }

    // Saludo simple
    public void greets() {
        System.out.println("Woof");
    }

    // Saludo cuando ve a otro perro (Sobrecarga/Overloading)
    public void greets(Dog another) {
        System.out.println("Woooof");
    }

    @Override
    public String toString() {
        // Formato: Dog[Mammal[Animal[name="?"]]]
        return "Dog[" + super.toString() + "]";
    }
}