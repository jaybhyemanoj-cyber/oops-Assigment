public class Resort {
    int RNo;
    String Name;
    double Charges;
    int Days;

    double Compute() {
        double Amount = Days * Charges;
        if (Amount > 11000) {
            Amount = 1.02 * Days * Charges;
        }
        return Amount;
    }

    void GetInfo(int RNo, String Name, double Charges, int Days) {
        this.RNo = RNo;
        this.Name = Name;
        this.Charges = Charges;
        this.Days = Days;
    }

    void DispInfo() {
        double Amount = Compute();
        System.out.println("Room Number : " + RNo);
        System.out.println("Name        : " + Name);
        System.out.println("Charges     : " + Charges);
        System.out.println("Days        : " + Days);
        System.out.printf("Amount      : %.2f%n", Amount);
    }

    public static void main(String[] args) {
        Resort guest1 = new Resort();
        guest1.GetInfo(101, "Alice", 500, 10);
        guest1.DispInfo();

        System.out.println("-------------------");

        Resort guest2 = new Resort();
        guest2.GetInfo(102, "Bob", 1500, 10);
        guest2.DispInfo();

        System.out.println("-------------------");

        Resort guest3 = new Resort();
        guest3.GetInfo(103, "Charlie", 1100, 10);
        guest3.DispInfo();
    }
}
