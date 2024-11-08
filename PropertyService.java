
import java.util.ArrayList;
import java.util.List;

public class PropertyService {
    private List<Property> properties = new ArrayList<>();

    public void addProperty(Property property) {
        properties.add(property);
    }

    public List<Property> getAllProperties() {
        return properties;
    }

    public void rentProperty(int propertyId) {
        for (Property property : properties) {
            if (property.getId() == propertyId) {
                property.rentProperty();
            }
        }
    }

    public void vacateProperty(int propertyId) {
        for (Property property : properties) {
            if (property.getId() == propertyId) {
                property.vacateProperty();
            }
        }
    }
}
