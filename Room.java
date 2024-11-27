public class Room {
    private String Room_type;
    private double Room_Price;

    public void selectRoom(String Room_type){
        if("Single bed".equals(Room_type)){
            this.Room_Price = 1500;
       }else if("Double Bed".equals(Room_type)){
            this.Room_Price = 2000;
       }
    }
    public double getRoomPrice(){
        return Room_Price;
    }

}