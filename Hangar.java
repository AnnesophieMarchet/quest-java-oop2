public class Hangar {
    public static void main(String[] args) {
        Car Mercedes = new Car("Mercedes", 101);
        Boat PetitNavire = new Boat("Petit Navire", 1234321);
        System.out.println(Mercedes.doStuff());
        System.out.printf(PetitNavire.doStuff());
    }
}
