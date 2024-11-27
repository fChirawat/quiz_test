public class BillCalculation {
    private double WATER_RATE = 5.0;
    private double Elect_RATE = 6.0;
    private double Water_bill;
    private double Elect_bill;
    private double Room_Price;
 
    // Constructor
    public BillCalculation(double waterBill, double electBill, double roomPrice) {
       this.Water_bill = waterBill;
       this.Elect_bill = electBill;
       this.Room_Price = roomPrice;
    }
 
    // Method to calculate water bill
    public double CalculationWaterbill() {
       return this.Water_bill * this.WATER_RATE;
    }
 
    // Method to calculate electric bill
    public double CalculationElectbill() {
       return this.Elect_bill * this.Elect_RATE;
    }
 
    // Method to calculate the total bill
    public double Totalbill() {
       return this.Room_Price + this.CalculationWaterbill() + this.CalculationElectbill();
    }
 }
 
 public class Main {
    public static void main(String[] args) {
       // Simulating user input or values
       double waterUnits = 10;  // example water units
       double electricUnits = 15;  // example electric units
       double roomPrice = 1500;  // example room price (e.g., for Single bed)
 
       // Bill Calculation
       BillCalculation billCalculation = new BillCalculation(waterUnits, electricUnits, roomPrice);
       double waterBill = billCalculation.CalculationWaterbill();
       double electricBill = billCalculation.CalculationElectbill();
       double totalBill = billCalculation.Totalbill();
 
       // Display results
       System.out.println("Water Bill: " + waterBill);
       System.out.println("Electric Bill: " + electricBill);
       System.out.println("Total Bill: " + totalBill);
    }
 }
 