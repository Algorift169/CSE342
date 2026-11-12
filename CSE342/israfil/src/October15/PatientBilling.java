package October15;

/*1. A hospital maintains billing records for different categories of patients. Create an
abstract class Patient containing private variables patientName, patientId, and
treatmentCost, along with a constructor, getter methods, and an abstract method
calculateFinalBill().
*/

abstract class Patient {
    private String patientName;
    private String patientId;
    private double treatmentCost = 0.0;

    private Patient() {
        this.patientName = " ";
        this.patientId = " ";
        this.treatmentCost = 0.0;
    }

    public Patient(String patientName, String patientId, double treatmentCost) {
        this.patientName = patientName;
        this.patientId = patientId;
        this.treatmentCost = treatmentCost;
    }

    abstract double calculateFinalBill(int days);

    abstract void display();

    public String getName() {
        return this.patientName;
    }

    public String getId() {
        return this.patientId;
    }

    public double getTcost() {
        return this.treatmentCost;
    }
}

/*
 * Create subclasses InPatient and OutPatient. For inpatients,
 * add room charges of Tk. 2,000 per day and a 5% service charge on the
 * treatment cost. For outpatients, add a fixed consultation fee of Tk. 800.
 */
class InPatient extends Patient {
    final double roomCharge = 2000;
    final double serviceCharge = 0.05;

    InPatient(String patientName, String patientId, double treatmentCost) {
        super(patientName, patientId, treatmentCost);
    }

    double calculateFinalBill(int days) {
        return super.getTcost() + (days * this.roomCharge) + (super.getTcost() * this.serviceCharge);
    }

    void display() {
        System.out.println("Name: " + super.getName());
        System.out.println("Id: " + super.getId());
        System.out.println("Final Bill: " + this.calculateFinalBill(30));
        System.out.println("___________________________________________________________");
    }

}

class OutPatient extends Patient {

    final int consultationFee = 800;

    public OutPatient(String patientName, String patientId, double treatmentCost) {
        super(patientName, patientId, treatmentCost);
    }

    double calculateFinalBill(int days) {
        return super.getTcost() + this.consultationFee;
    }

    void display() {
        System.out.println("Name: " + super.getName());
        System.out.println("Id: " + super.getId());
        System.out.println("Final Bill: " + this.calculateFinalBill(30));
        System.out.println("___________________________________________________________");
    }
}

/*
 * * main() method, create an array of Patient references, calculate each
 * patient&#39;s
 * final bill, and display the patient with the highest bill.
 */

public class PatientBilling {
    public static void main(String[] args) {
        Patient[] patients = {
                new InPatient("Rahim", "101", 10000),
                new OutPatient("Karim", "102", 6000),
                new InPatient("Nila", "103", 15000),
                new OutPatient("Mina", "104", 8000)
        };

        Patient highestpatient = patients[0];

        for (int i = 0; i < patients.length; i++) {
            patients[i].display();
            if (patients[i].calculateFinalBill(30) > highestpatient.calculateFinalBill(30)) {
                highestpatient = patients[i];
            }
        }

        System.out.println("Patient with highest bill: " + highestpatient.getName());
    }
}
