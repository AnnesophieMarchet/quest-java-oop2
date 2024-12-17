

public class Boat extends Vehicule {
   public Boat(String brand, int kilometers) {
        super(brand, kilometers);
    }

    @Override
    public String doStuff() {
        return "Bateau " + getBrand() + " navigue et coule  et je fais glou glou.";
    }
}
