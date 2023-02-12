import java.util.ArrayList;

public class Main {

    //TODO: add your methods here
    private static ArrayList<Integer> list = new ArrayList<>();

    private static void addNumber(int n) {
        list.add(Integer.valueOf(n));
        System.out.println(list);
    }

    private static int getTotal() {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }

    private static boolean isFound(int n) {
        return list.contains(Integer.valueOf(n));
    }

    private static void removeNumber(int n) {
        list.remove(Integer.valueOf(n));
        System.out.println(list);
    }

    public static void main(String[] args) {
        System.out.println("Adding numbers to the list");
        addNumber(3);
        addNumber(8);
        addNumber(24);
        System.out.println("The total is: " + getTotal());
        System.out.println("8 in the list : " + isFound(8) );
        System.out.println("5 in the list : " + isFound(5) );
        removeNumber(8);
        System.out.println("The total is: " + getTotal());
    }

}
