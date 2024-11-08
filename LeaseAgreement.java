
import java.util.Date;

public class LeaseAgreement {
    private int id;
    private User tenant;
    private Property property;
    private Date startDate;
    private Date endDate;

    public LeaseAgreement(int id, User tenant, Property property, Date startDate, Date endDate) {
        this.id = id;
        this.tenant = tenant;
        this.property = property;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getters and setters for each property
}
