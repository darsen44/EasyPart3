
// Task 5
public class Exchange {
    public static void main(String[] args) {
        double hrn = 1000;
        double rate = 28.03;
        System.out.println(hrn + " hrn is " + Math.round(convert(hrn,rate)*100.0)/100.0 + " dollars");
    }

    private static double convert(double hrn, double rate) {
        return hrn / rate;
    }
}
