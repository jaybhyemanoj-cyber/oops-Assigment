// ============================================================
// Question 15 - Ride Booking Application
// ============================================================

abstract class Ride {
    double distance;

    Ride(double distance) {
        this.distance = distance;
    }

    abstract double calculateFare();

    void displayFare() {
        System.out.println("Ride Type : " + this.getClass().getSimpleName());
        System.out.println("Distance  : " + distance + " km");
        System.out.printf("Fare      : Rs. %.2f%n", calculateFare());
    }
}

class BikeRide extends Ride {
    BikeRide(double distance) {
        super(distance);
    }

    double calculateFare() {
        return 5 * distance;
    }
}

class AutoRide extends Ride {
    AutoRide(double distance) {
        super(distance);
    }

    double calculateFare() {
        return 8 * distance;
    }
}

class CarRide extends Ride {
    CarRide(double distance) {
        super(distance);
    }

    double calculateFare() {
        return 12 * distance;
    }
}

public class RideBooking {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   Question 15 - Ride Booking System    ");
        System.out.println("========================================");

        Ride[] rides = new Ride[3];
        rides[0] = new BikeRide(10);
        rides[1] = new AutoRide(15);
        rides[2] = new CarRide(20);

        for (Ride ride : rides) {
            ride.displayFare();
            System.out.println("-------------------");
        }
    }
}
