public class Car extends Vehicule {

    public Car(String brand, int kilometers) {
        super(brand, kilometers);
    }

    @Override
    public String doStuff() {
        return "La voiture " + getBrand() + " roule sur le chemin de la gloire et je fais vroum vroum !.";
    }
}
