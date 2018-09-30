
// Task 4
public class Speed {
    public static void main(String[] args) {
        int distance = 100; // km
        double time = 65; // minutes
        speed(distance,time);
    }

    private static void speed(int distance, double time) {
        System.out.println("Speed is: " + Math.round((distance/(time/60))*100.0) / 100.0 + "km/h");
    }
}
