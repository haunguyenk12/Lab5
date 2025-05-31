public class Main {
    public static void main(String[] args) {
        RequestCreator low = new LowPriorityConcreteCreator();
        RequestCreator mid = new MidPriorityConcreteCreator();
        RequestCreator high = new HighPriorityConcreteCreator();

        low.processRequest();
        mid.processRequest();
        high.processRequest();
    }
}