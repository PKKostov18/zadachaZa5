public class Delegate {

    private String name;
    private String UCN;
    private String city;
    private double travelExpenses;

    public Delegate(String name, String UCN, String city, double travelExpenses) {
        this.name = name;
        this.UCN = UCN;
        this.city = city;
        this.travelExpenses = travelExpenses;
    }

    public Delegate() {
        this.name = "Plamen";
        this.UCN = "0443050523";
        this.city = "Burgas";
        this.travelExpenses = 1000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUCN() {
        return UCN;
    }

    public void setUCN(String UCN) {
        this.UCN = UCN;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getTravelExpenses() {
        return travelExpenses;
    }

    public void setTravelExpenses(double travelExpenses) {
        this.travelExpenses = travelExpenses;
    }

    @Override
    public String toString() {
        return "Delegate{" +
                "name='" + name + '\'' +
                ", UCN='" + UCN + '\'' +
                ", city='" + city + '\'' +
                ", travelExpenses=" + travelExpenses +
                '}';
    }
}
