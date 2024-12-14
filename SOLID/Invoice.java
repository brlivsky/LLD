class Srp {
    public static void main(String[] args) {
        Invoice one = new Invoice(100);
		System.out.println("The total amount is " + one.calculateTotal());
		one.saveToDatabase();
    }
}

public class Invoice {
	private double amount;

	public Invoice(double amount) {
    		this.amount = amount;
	}

	// Calculate total amount
	public double calculateTotal() {
            return amount + amount * .20; 
            // Should be 0.20 instead of 20/100 	
      }

	// Save invoice to the database
	public void saveToDatabase() {
    		System.out.println("Connecting to database...");
    		// Simulate saving invoice
    		System.out.println("Invoice saved with amount: " + calculateTotal());
	}
}