public class Motorbike extends Vehicle {
    private double limit;


    public Motorbike(String nazwa, int rocznik, double limit) {
        super(nazwa, rocznik);
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }


    @Override
    public String toString() {
        return super.toString() + "Limit" + " " + limit;
    }
}
