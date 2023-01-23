public class Hotel {

    private String hotelName;
    private int roomNumber;
    private double oneNightPrice;

    public Hotel(String hotelName, int roomNumber, double oneNightPrice) {
        this.hotelName = hotelName;
        this.roomNumber = roomNumber;
        this.oneNightPrice = oneNightPrice;
    }

    public Hotel() {
        this.hotelName = "Hotel1";
        this.roomNumber = 101;
        this.oneNightPrice = 150;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getOneNightPrice() {
        return oneNightPrice;
    }

    public void setOneNightPrice(double oneNightPrice) {
        this.oneNightPrice = oneNightPrice;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", roomNumber=" + roomNumber +
                ", oneNightPrice=" + oneNightPrice +
                '}';
    }
}
