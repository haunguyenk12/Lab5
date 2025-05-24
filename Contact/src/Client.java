

public class Client {
    public Contract requestCreateRentalContract(Contract builder) {
        builder.BuildContractID();
        builder.BuildPropertyID();
        builder.BuildTenantID();
        builder.BuildRentAmount();
        return builder.SignContract();
    }
}
