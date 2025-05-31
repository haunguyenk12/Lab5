import java.time.LocalDate;

public class LowPriorityConcrete implements RequestProduct {
    private String priority;
    private String status;
    private LocalDate expireDay;

    public void setPriority() {
        this.priority = "Ignore";
    }

    public void setStatus() {
        this.status = "Done";
    }

    public void setExpire() {
        this.expireDay = LocalDate.now();
    }

    public void processRequest() {
        setPriority();
        setStatus();
        setExpire();
        System.out.println("Request processed with low priority");
        System.out.println(priority);
        System.out.println(status);
        System.out.println(expireDay);
        System.out.println("Request denied");
    }

}