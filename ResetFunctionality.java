public class ResetFunctionality {
    private double waterUnits;
    private double electricUnits;
    private double lastMeter;
    private double currentMeter;

    public void reset() {
        this.waterUnits = 0;
        this.electricUnits = 0;
        this.lastMeter = 0;
        this.currentMeter = 0;
    }

    public void displayReset() {
        System.out.println("Water Units: " + waterUnits);
        System.out.println("Electric Units: " + electricUnits);
        System.out.println("Last Meter: " + lastMeter);
        System.out.println("Current Meter: " + currentMeter);
    }
}
