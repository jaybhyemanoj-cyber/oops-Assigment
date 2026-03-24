// ============================================================
// Question 16 - Hospital Staff Management
// ============================================================

class Staff {
    String name;

    Staff(String name) {
        this.name = name;
    }

    void work() {
        System.out.println(name + " is a Staff member.");
    }
}

class Doctor extends Staff {
    String specialization;

    Doctor(String name, String specialization) {
        super(name);
        this.specialization = specialization;
    }

    void work() {
        System.out.println("Dr. " + name + " (" + specialization + ") is examining patients and prescribing medicines.");
    }
}

class Nurse extends Staff {
    String ward;

    Nurse(String name, String ward) {
        super(name);
        this.ward = ward;
    }

    void work() {
        System.out.println("Nurse " + name + " is taking care of patients in " + ward + " ward.");
    }
}

class Receptionist extends Staff {
    Receptionist(String name) {
        super(name);
    }

    void work() {
        System.out.println("Receptionist " + name + " is managing appointments and handling patient queries.");
    }
}

public class HospitalStaff {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("  Question 16 - Hospital Staff System   ");
        System.out.println("========================================");

        Staff[] staffMembers = new Staff[3];
        staffMembers[0] = new Doctor("Smith", "Cardiology");
        staffMembers[1] = new Nurse("Emma", "ICU");
        staffMembers[2] = new Receptionist("John");

        for (Staff s : staffMembers) {
            s.work();
            System.out.println("-------------------");
        }
    }
}
