public class CARRENTAL {
    int CarId;
    String CarType;
    float Rent;

    void GetCar(int CarId, String CarType) {
        this.CarId = CarId;
        this.CarType = CarType;
        this.Rent = GetRent();
    }

    float GetRent() {
        switch (CarType.toLowerCase()) {
            case "small car":
                return 1000;
            case "van":
                return 800;
            case "suv":
                return 2500;
            default:
                return 0;
        }
    }

    void ShowCar() {
        System.out.println("Car ID   : " + CarId);
        System.out.println("Car Type : " + CarType);
        System.out.println("Rent     : " + Rent);
    }

    public static void main(String[] args) {
        CARRENTAL car1 = new CARRENTAL();
        car1.GetCar(101, "Small Car");
        car1.ShowCar();

        System.out.println("-------------------");

        CARRENTAL car2 = new CARRENTAL();
        car2.GetCar(102, "Van");
        car2.ShowCar();

        System.out.println("-------------------");

        CARRENTAL car3 = new CARRENTAL();
        car3.GetCar(103, "SUV");
        car3.ShowCar();
    }
}
