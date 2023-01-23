public class Conference {

    private Delegate delegate;
    private Hotel hotel;
    private DelegationCard delegationCard;

    public Conference(Delegate delegate, Hotel hotel, DelegationCard delegationCard) {
        this.delegate = delegate;
        this.hotel = hotel;
        this.delegationCard = delegationCard;
    }

    public Delegate getDelegate() {
        return delegate;
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public DelegationCard getDelegationCard() {
        return delegationCard;
    }

    public void setDelegationCard(DelegationCard delegationCard) {
        this.delegationCard = delegationCard;
    }

    @Override
    public String toString() {
        return "Conference{" +
                "delegate=" + delegate +
                ", hotel=" + hotel +
                ", delegationCard=" + delegationCard +
                '}';
    }
}
