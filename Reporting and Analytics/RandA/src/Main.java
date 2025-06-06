import java.util.*;


class Property {
    private final String name;
    private final double rentAmount;
    private final String ownerName;
    private final String location;

    public Property(String name, double rentAmount, String ownerName, String location) {
        this.name = name;
        this.rentAmount = rentAmount;
        this.ownerName = ownerName;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getLocation() {
        return location;
    }

    public boolean isPremium() {
        return rentAmount > 2000;
    }

    public double getYearlyRent() {
        return rentAmount * 12;
    }
}


class PropertyPrinter {
    public static void print(Property property) {
        System.out.println("Property: " + property.getName());
        System.out.println("Rent Amount: $" + property.getRentAmount());
        System.out.println("Owner: " + property.getOwnerName());
        System.out.println("Location: " + property.getLocation());
        System.out.println(property.isPremium() ? "This is a premium property." : "This is a standard property.");
        System.out.println("Yearly Rent: $" + property.getYearlyRent());
        System.out.println("--------------------");
    }
}


class FinancialReport {
    private final String reportTitle;
    private final List<Property> properties;

    public FinancialReport(String reportTitle, List<Property> properties) {
        this.reportTitle = reportTitle;
        this.properties = new ArrayList<>(properties); 
    }

    public void generateReport() {
        System.out.println("Financial Report: " + reportTitle);
        System.out.println("----------------------------");
        double totalRent = 0;
        for (Property property : properties) {
            PropertyPrinter.print(property);
            totalRent += property.getRentAmount();
        }
        System.out.println("Total Rent Amount: $" + totalRent);
    }
}


public class Main {
    public static void main(String[] args) {
        List<Property> propertyList = List.of(
            new Property("Apartment A", 1500.0, "John Doe", "City Center"),
            new Property("House B", 2000.0, "Jane Smith", "Suburb"),
            new Property("Condo C", 1800.0, "Bob Johnson", "Downtown")
        );

        FinancialReport report = new FinancialReport("Monthly Rent Summary", propertyList);
        report.generateReport();
    }
}
