package model;

import java.util.ArrayList;
import java.util.List;

public class Landlord {
    private String name;
    private String phone;
    private String email;
    private List<Property> properties;

    public Landlord(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.properties = new ArrayList<>();
    }

    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }
    public List<Property> getProperties() { return properties; }

    public void addProperty(Property property) {
        properties.add(property);
    }

    public void listProperties() {
        for (Property property : properties) {
            System.out.println(property);
        }
    }

    @Override
    public String toString() {
        return "Landlord: " + name + ", Email: " + email + ", Phone: " + phone;
    }
}
