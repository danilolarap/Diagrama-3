public class Mammal extends Animal {

    // Este constructor DEBE existir para que Cat y Dog funcionen
    public Mammal(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Mammal[" + super.toString() + "]";
    }
}