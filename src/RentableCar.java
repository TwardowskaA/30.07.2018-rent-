public class RentableCar extends Car implements Rentable {

    private Person person;

    public RentableCar(String nazwa, int rocznik, int siedzenia) {
        super(nazwa, rocznik, siedzenia);
    }

    @Override
    public void rent(String firstName, String lastName, String id) {
        person = new Person(firstName, lastName, id);

    }

    @Override
    public void handOver() {
        person = null;

    }

    @Override
    public boolean isRent() {
        return person != null;
    }

    @Override
    public String toString() {
        return super.toString() + "Osoba" + " " + person;
    }
}
