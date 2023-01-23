public class DelegationCard {

    private String delegateNumber;
    private String dateOfCheckin;
    private String dateOfCheckout;

    public DelegationCard(String delegateNumber, String dateOfCheckin, String dateOfCheckout) {
        this.delegateNumber = delegateNumber;
        this.dateOfCheckin = dateOfCheckin;
        this.dateOfCheckout = dateOfCheckout;
    }

    public DelegationCard() {
        this.delegateNumber = "123456";
        this.dateOfCheckin = "05/03/2004";
        this.dateOfCheckout = "10/03/2004";
    }

    public String getDelegateNumber() {
        return delegateNumber;
    }

    public void setDelegateNumber(String delegateNumber) {
        this.delegateNumber = delegateNumber;
    }

    public String getDateOfCheckin() {
        return dateOfCheckin;
    }

    public void setDateOfCheckin(String dateOfCheckin) {
        this.dateOfCheckin = dateOfCheckin;
    }

    public String getDateOfCheckout() {
        return dateOfCheckout;
    }

    public void setDateOfCheckout(String dateOfCheckout) {
        this.dateOfCheckout = dateOfCheckout;
    }

    @Override
    public String toString() {
        return "DelegationCard{" +
                "delegateNumber='" + delegateNumber + '\'' +
                ", dateOfCheckin='" + dateOfCheckin + '\'' +
                ", dateOfCheckout='" + dateOfCheckout + '\'' +
                '}';
    }
}
