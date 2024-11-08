
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {

    private PropertyService propertyService = new PropertyService();
    private ListView<String> propertyList;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("RentSmart - Rental Management");

        // Initialize the property list view
        propertyList = new ListView<>();
        loadProperties();

        Button addPropertyButton = new Button("Add Property");
        addPropertyButton.setOnAction(e -> addProperty());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(propertyList, addPropertyButton);

        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Loads properties into the list view
    private void loadProperties() {
        for (Property property : propertyService.getAllProperties()) {
            propertyList.getItems().add(property.getAddress() + " - $" + property.getRentAmount());
        }
    }

    // Adds a new property for demonstration purposes
    private void addProperty() {
        Property newProperty = new Property(propertyList.getItems().size() + 1, 
                                            "New Property " + (propertyList.getItems().size() + 1), 
                                            1200.00);
        propertyService.addProperty(newProperty);
        propertyList.getItems().add(newProperty.getAddress() + " - $" + newProperty.getRentAmount());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
