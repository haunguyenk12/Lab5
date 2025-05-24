

public class Permanent implements Contract {
    private String contractID;
    private String propertyID;
    private String tenantID;
    private double rentAmount;

    @Override
    public void BuildContractID() {
        contractID = "PERM-001" ;
    }

    @Override
    public void BuildPropertyID() {
        propertyID = "PROP-001";
    }

    @Override
    public void BuildTenantID() {
        tenantID = "TENANT-001";
    }

    @Override
    public void BuildRentAmount() {
        rentAmount = 1000.0;
    }

    @Override
    public Contract SignContract() {
        System.out.println("Permanent Contract Signed:");
        System.out.println("Contract ID: " + contractID);
        System.out.println("Property ID: " + propertyID);
        System.out.println("Tenant ID: " + tenantID);
        System.out.println("Rent Amount: $" + rentAmount);
        return this;
    }
}
