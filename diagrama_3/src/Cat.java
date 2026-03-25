public class Cat extends Mammal {

    // El constructor debe recibir el nombre y pasarlo a Mammal
    public Cat(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        // Formato: Cat[Mammal[Animal[name="?"]]]
        return "Cat[" + super.toString() + "]";
    }
}