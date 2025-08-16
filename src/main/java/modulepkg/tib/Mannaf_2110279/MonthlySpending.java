package modulepkg.tib.Mannaf_2110279;

public class MonthlySpending {
    private String category;
    private double amountSpent;
    private double givenBudget;
    private double difference;
    private String note;

    public MonthlySpending(String category, double amountSpent, double givenBudget, String note) {
        this.category = category;
        this.amountSpent = amountSpent;
        this.givenBudget = givenBudget;
        this.difference = givenBudget - amountSpent;
        this.note = note;
    }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public double getAmountSpent() { return amountSpent; }
    public void setAmountSpent(double amountSpent) { this.amountSpent = amountSpent; }

    public double getGivenBudget() { return givenBudget; }
    public void setGivenBudget(double givenBudget) { this.givenBudget = givenBudget; }

    public double getDifference() { return difference; }
    public void setDifference(double difference) { this.difference = difference; }

    public String getNote() { return note; }
    public void setNote(String note) { this.note = note; }
}
