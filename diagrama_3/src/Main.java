public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat("Luna");
        Dog myDog = new Dog("Rex");
        Dog otherDog = new Dog("Toby");

        System.out.println(myCat.toString());
        myCat.greets();

        System.out.println("\n" + myDog.toString());
        myDog.greets();          // Llama al saludo normal
        myDog.greets(otherDog);  // Llama al saludo cuando ve a otro perro
    }
}