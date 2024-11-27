import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Select Room
        System.out.println("Available room types:");
        System.out.println("1. Single bed = 1500");
        System.out.println("2. Double Bed = 2000");
        System.out.print("Please select room type (Single bed or Double Bed): ");
        String roomType = scanner.nextLine();

        Room room = new Room();
        room.selectRoom(roomType);
        double roomPrice = room.getRoomPrice();

        // Get meter readings
        System.out.print("Enter Last Meter Reading: ");
        double lastMeter = scanner.nextDouble();

        System.out.print("Enter Current Meter Reading: ");
        double currentMeter = scanner.nextDouble();

        MeterValidation meterValidation = new MeterValidation(lastMeter, currentMeter);
        if (!meterValidation.validateMeter()) {
            // Exit if meter validation fails
            return;
        }

        // Get water and electric units
        System.out.print("Enter Water Units: ");
        double waterUnits = scanner.nextDouble();

        System.out.print("Enter Electric Units: ");
        double electricUnits = scanner.nextDouble();

        // Bill Calculation
        BillCalculation billCalculation = new BillCalculation(waterUnits, electricUnits, roomPrice);
        double waterBill = billCalculation.CalculationWaterbill();
        double electricBill = billCalculation.CalculationElectbill();
        double totalBill = billCalculation.Totalbill();

        // Display final results
        DisplayFinalResults displayFinalResults = new DisplayFinalResults(roomPrice, waterBill, electricBill, totalBill);
        displayFinalResults.display();

        // Reset functionality (Optional if you want to reset the data)
        System.out.print("Do you want to reset the bill calculations? (yes/no): ");
        String resetChoice = scanner.next();
        if (resetChoice.equalsIgnoreCase("yes")) {
            ResetFunctionality resetFunctionality = new ResetFunctionality();
            resetFunctionality.reset();
            resetFunctionality.displayReset();
        }

        scanner.close();
    }
}
