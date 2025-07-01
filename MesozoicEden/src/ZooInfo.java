package MesozoicEden.src;

public class ZooInfo {

    //Instance Variables
        static String openingHours;
        static String closingHours;
        static int maxVisitors;
        static double safetyRating;
        static double budget;
    
    //Constructor

    //Methods
        public static String getOpeningHours() {return openingHours;}
        public static String getClosingHours() {return closingHours;}
        public static int getMaxVisitors() {return maxVisitors;}
        public static double getSafteyRating() {return safetyRating;}
        public static double getBudget() {return budget;}

        public static void welcome() {
            System.out.println("Welcome to Mesozoic Eden!!" + "/n We open at" + openingHours + " and close at " + closingHours + "/n Mesozoic Eden is safe and secure. /n Our current saftey rating is " + safetyRating);
        }
}
