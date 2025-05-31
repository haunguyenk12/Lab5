import java.time.LocalDate;

public class HighPriorityConcrete implements RequestProduct {
    private String priority;
    private String status;
    private LocalDate expireDay;

    public void setPriority() {
        this.priority = "Emergency";
    }

    public void setStatus() {
        this.status = "Accept";
    }

    public void setExpire() {
        this.expireDay = LocalDate.now();
    }

    public void processRequest() {
        setPriority();
        setStatus();
        setExpire();
        System.out.println("Request processed with high priority");
        System.out.println(priority);
        System.out.println(status);
        System.out.println(expireDay);
        System.out.println("Emergency request, our Administer will contact you immediately!");
    }

}
