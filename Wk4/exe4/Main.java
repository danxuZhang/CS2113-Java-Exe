public class Main {

    // Add your method here
    private static void describe(String s, Priority p) {
        switch(p) {
        case HIGH:
            System.out.println(s + " indicates high priority");
            break;
        case MEDIUM:
            System.out.println(s + " indicates medium priority");
            break;
        case LOW: 
            System.out.println(s + " indicates low priority");
            break;
        }
    }

    public static void main(String[] args) {
        describe("Red", Priority.HIGH);
        describe("Orange", Priority.MEDIUM);
        describe("Blue", Priority.MEDIUM);
        describe("Green", Priority.LOW);
    }
}
