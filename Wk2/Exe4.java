public class Exe4 {



    // ADD YOUR CODE HERE
    public static double[] getMultipleGradeCaps(String[] grades) {
        int sz = grades.length;
        double[] rtn = new double[sz];
        for (int i = 0; i < sz; ++i) {
            rtn[i] = getGradeCap(grades[i]);
        }
        return rtn;
    }




    public static double getGradeCap(String grade) {

        double cap = 0;

        switch (grade) {

        case "A+":

        case "A":

            cap = 5.0;

            break;

        case "A-":

            cap = 4.5;

            break;

        case "B+":

            cap = 4.0;

            break;

        case "B":

            cap = 3.5;

            break;

        case "B-":

            cap = 3.0;

            break;

        case "C":

            cap = 2.5;

            break;

        default:

        }

        return cap;

    }



    public static void main(String[] args) {

        String[] grades = new String[]{"A+", "A", "A-"};

        double[] caps = getMultipleGradeCaps(grades);

        for (int i = 0; i < grades.length; i++) {

            System.out.println(grades[i] + ":" + caps[i]);

        }

    }

}


