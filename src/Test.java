public class Test {

    public static void main(String[] args) {
        RentableCar car = new RentableCar("Skoda", 1994, 4);
        car.rent("Jan", "Kowalski", "121231");
        car.goBack();
        System.out.println(car.toString());
        System.out.println(car.isRent());

        car.handOver();

        System.out.println(car.isRent());


    }

}

