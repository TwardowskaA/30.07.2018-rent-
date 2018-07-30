public abstract class Vehicle implements  Movable {
    private String nazwa;
    private int rocznik;
    private String kierunek;

    public Vehicle(String nazwa, int rocznik) {
        this.nazwa = nazwa;
        this.rocznik = rocznik;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getRocznik() {
        return rocznik;
    }

    public void setRocznik(int rocznik) {
        this.rocznik = rocznik;
    }


    public void turnLeft() {
        kierunek = "lewo";
    }


    public void turnRight() {
        kierunek = "prawo";
    }


    public void goForward() {
        kierunek = "przod";
    }


    public void goBack() {
        kierunek = "tył";
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "nazwa='" + nazwa + '\'' +
                ", rocznik=" + rocznik +
                ", kierunek='" + kierunek + '\'' +
                '}';
    }
}
