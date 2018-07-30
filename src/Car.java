public class Car extends Vehicle{

    private int siedzenia;

    public Car(String nazwa, int rocznik, int siedzenia) {
        super(nazwa, rocznik);
        this.siedzenia = siedzenia;
    }

    public int getSiedzenia() {
        return siedzenia;
    }

    public void setSiedzenia(int siedzenia) {
        this.siedzenia = siedzenia;
    }

    @Override
    public String toString() {
        return super.toString() + "Liczba siedzeń:" + " " + siedzenia + " ";
    }
}
