public class DisplayFinalResults {
    private double Room_Price;
    private double Water_bill;
    private double Elect_bill;
    private double Totalbill;

    public DisplayFinalResults(double roomPrice, double waterBill, double electricBill, double totalBill) {
        this.Room_Price = Room_Price;
        this.Water_bill = Water_bill;
        this.Elect_bill = Elect_bill;
        this.Totalbill = Totalbill;
    }

    public void display() {
        System.out.println("\nRoom Price: " + Room_Price);
        System.out.println("Water Bill: " + Water_bill);
        System.out.println("Electric Bill: " + Elect_bill);
        System.out.println("Total Bill: " + Totalbill);
    }
}
