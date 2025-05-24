package src;

public class demo {
    public static void main(String[] args) {
        Client client = new Client();
        
        Contract shortTermContract = new ShortTerm();

        client.requestCreateRentalContract(shortTermContract);
    }
}
