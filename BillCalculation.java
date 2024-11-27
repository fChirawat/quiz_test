public class BillCalculation {
    private double WATER_RATE = 5.0;
    private double Elect_RATE = 6.0;
    private double Water_bill;
    private double Elect_bill;
    private double Room_Price;

    public BillCalculation(double Water_bill, double Elect_bill, double Room_Price) {
        this.Water_bill = Water_bill;
        this.Elect_bill = Elect_bill;
        this.Room_Price = Room_Price;

    }


    public double  CalculationWaterbill(){
        return Water_bill * WATER_RATE;
    }

    
    public double  CalculationElectbill(){
        return Elect_bill * Elect_RATE;
    }


    public double Totalbill(){
        return  Room_Price + CalculationWaterbill() + CalculationElectbill();
    }
    
}

