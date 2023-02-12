import java.util.HashMap;

public class Main {
    private static HashMap<String, Integer> roster = new HashMap<>();

    //TODO: add your methods here
    private static void addToRoster(String weekdayString) {
        roster.putIfAbsent(weekdayString, 0);
        roster.put(weekdayString, roster.get(weekdayString)+1);
    }

    private static void printRoster() {
        roster.forEach((weekdayString, num) -> {
            System.out.println(weekdayString + " => " + Integer.toString(num));
        });
    }

    public static void main(String[] args) {
        addToRoster("Monday"); // i.e., one person signed up for Monday
        addToRoster("Wednesday"); // i.e., one person signed up for Wednesday
        addToRoster("Wednesday"); // i.e., another person signed up for Wednesday
        addToRoster("Friday");
        addToRoster("Monday");
        printRoster();
    }

}
