import java.time.LocalDate;

public class MidPriorityConcrete implements RequestProduct {
    private String priority;
    private String status;
    private LocalDate expireDay;

    public void setPriority() {
        this.priority = "Medium";
    }

    public void setStatus() {
        this.status = "Accepted";
    }

    public void setExpire() {
        this.expireDay = LocalDate.now().plusMonths(1);
    }

    public void processRequest() {
        setPriority();
        setStatus();
        setExpire();
        System.out.println("Request processed with medium priority");
        System.out.println(priority);
        System.out.println(status);
        System.out.println(expireDay);
        System.out.println("Request accepted");
    }

}