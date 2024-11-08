
import java.util.Date;

public class Payment {
    private int id;
    private LeaseAgreement leaseAgreement;
    private double amount;
    private Date paymentDate;

    public Payment(int id, LeaseAgreement leaseAgreement, double amount, Date paymentDate) {
        this.id = id;
        this.leaseAgreement = leaseAgreement;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    // Getters and setters for each property
}
