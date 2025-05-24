package src;

public interface Contract {
    void BuildContractID();
    void BuildPropertyID();
    void BuildTenantID();
    void BuildRentAmount();
    Contract SignContract();
}
