package mesozoiceden.zoo;

public class zooInfo {
// Instance Variables
    String openingHours;
    String closingHours;
    int maxVisitors;
    double safetyRating; //Should be out of 10. SR = (CurrentVisitors)/(DinoSafteyRatingAverage)
    double budget;

    // Constructor
    public zooInfo(String openingHours, String closingHours, int maxVisitors, double safetyRating, double budget) {
        this.openingHours = openingHours;
        this.closingHours = closingHours;
        this.maxVisitors = maxVisitors;
        this.safetyRating = safetyRating;
        this.budget = budget;
    }

    // Methods
    public  String getOpeningHours() {
        return openingHours;
    }

    public String getClosingHours() {
        return closingHours;
    }

    public void getMaxVisitors() {
        System.out.println("There’s a maximum of " + maxVisitors + " people allowed in Mesozoic Eden.");
    }

    public double getSafteyRating() {
        return safetyRating;
    }

    public double getBudget() {
        return budget;
    }

    //Set methods

    public void setSafteyRating(double newSafteyRating) {
        safetyRating = newSafteyRating;
        System.out.println("Saftey Rating has been updated to: " + safetyRating);
    }

    public void setBudget(double newBudget) {
        budget = newBudget;
        System.out.println("Budget has been updated to: $" + newBudget);
    }

    public void welcome() {
        System.out.println("""
                           Welcome to Mesozoic Eden!!
                           We open at """ + openingHours + " and close at " + closingHours + "."
                        + "\nMesozoic Eden is safe and secure. /n Our current saftey rating is " + safetyRating + ".");
    }
}
