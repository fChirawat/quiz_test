public class MeterValidation {
    private double lastMeter;
    private double currentMeter;

    public MeterValidation(double lastMeter, double currentMeter) {
        this.lastMeter = lastMeter;
        this.currentMeter = currentMeter;
    }

    public boolean validateMeter() {
        if (currentMeter <= lastMeter) {
            System.out.println("แจ้งเตือน: ค่ามิเตอร์ครั้งปัจจุบันต้องมากกว่าค่ามิเตอร์ครั้งก่อน.");
            return false;
        }
        return true;
    }
}
