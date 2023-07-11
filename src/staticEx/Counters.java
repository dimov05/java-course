package staticEx;

public class Counters {
    static int count = 0;
    int countInstance = 0;

    private Counters(){
        count++;
        countInstance++;
        System.out.println("static counter:" + count);
        System.out.println("Without static:" +countInstance);
    }

    public static void main(String[] args) {
        Counters c1 = new Counters();
        Counters c2 = new Counters();
        Counters c3 = new Counters();
    }
}
