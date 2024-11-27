import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Display available room types
        System.out.println("Available room types:");
        System.out.println("1. Single bed (ราคา: 1500 บาท)");
        System.out.println("2. Double Bed (ราคา: 2000 บาท)");

        // Step 1: Select Room Type
        System.out.print("กรุณาเลือกประเภทห้อง (Single bed หรือ Double Bed): ");
        String roomType = scanner.nextLine(); // Read room type input

        // Create Room object and select the room type
        Room room = new Room();
        room.selectRoom(roomType); // Select the room based on input
        double roomPrice = room.getRoomPrice(); // Get the price of the selected room

        // Step 2: Get Water and Electricity Usage
        System.out.print("กรุณาใส่จำนวนหน่วยน้ำที่ใช้: ");
        double waterUsage = scanner.nextDouble(); // Read water usage

        System.out.print("กรุณาใส่จำนวนหน่วยไฟฟ้าที่ใช้: ");
        double electUsage = scanner.nextDouble(); // Read electricity usage

        // Step 3: Calculate the Bills
        BillCalculation billCalculation = new BillCalculation(waterUsage, electUsage, roomPrice);

        // Step 4: Calculate and display the total bill
        double totalBill = billCalculation.Totalbill();
        System.out.println("รวมค่าใช้จ่ายทั้งหมด: " + totalBill + " บาท");

        // Close the scanner
        scanner.close();
    }
}
