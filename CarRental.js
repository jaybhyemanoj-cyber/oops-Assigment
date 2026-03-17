class CARRENTAL {
    constructor() {
        this.CarId = 0;
        this.CarType = "";
        this.Rent = 0.0;
    }

    GetCar(CarId, CarType) {
        this.CarId = CarId;
        this.CarType = CarType;
        this.Rent = this.GetRent();
    }

    GetRent() {
        switch (this.CarType.toLowerCase()) {
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

    ShowCar() {
        console.log("Car ID   : " + this.CarId);
        console.log("Car Type : " + this.CarType);
        console.log("Rent     : " + this.Rent);
    }
}

const car1 = new CARRENTAL();
car1.GetCar(101, "Small Car");
car1.ShowCar();

console.log("-------------------");

const car2 = new CARRENTAL();
car2.GetCar(102, "Van");
car2.ShowCar();

console.log("-------------------");

const car3 = new CARRENTAL();
car3.GetCar(103, "SUV");
car3.ShowCar();
