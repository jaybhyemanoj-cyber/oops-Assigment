interface Bank {
    double getInterestRate();
}

class SBI implements Bank {
    public double getInterestRate() {
        return 6.75;
    }
}

class HDFC implements Bank {
    public double getInterestRate() {
        return 7.25;
    }
}

class ICICI implements Bank {
    public double getInterestRate() {
        return 7.00;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        System.out.println("===== Bank Interest Rates =====");

        Bank sbi = new SBI();
        Bank hdfc = new HDFC();
        Bank icici = new ICICI();

        System.out.println("SBI   Interest Rate : " + sbi.getInterestRate()  + "%");
        System.out.println("HDFC  Interest Rate : " + hdfc.getInterestRate() + "%");
        System.out.println("ICICI Interest Rate : " + icici.getInterestRate()+ "%");
    }
}
