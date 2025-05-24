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
        return this;
    }
}
