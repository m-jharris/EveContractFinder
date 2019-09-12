public class Contract {
    private String collateral;
    int contract_id;
    private String date_expired;
    private String date_issued;
    private int days_to_complete;
    private int end_location_id;
    private int issuer_corporation_id;
    private int issuer_id;
    private double price;
    private int reward;
    private int start_location_id;
    private String title;
    private String type;
    private double volume;

    public Contract(String collateral, int contract_id, String date_expired, String date_issued, int days_to_complete, int end_location_id, int issuer_corporation_id, int issuer_id, double price, int reward, int start_location_id, String title, String type, double volume) {
        this.collateral = collateral;
        this.contract_id = contract_id;
        this.date_expired = date_expired;
        this.date_issued = date_issued;
        this.days_to_complete = days_to_complete;
        this.end_location_id = end_location_id;
        this.issuer_corporation_id = issuer_corporation_id;
        this.issuer_id = issuer_id;
        this.price = price;
        this.reward = reward;
        this.start_location_id = start_location_id;
        this.title = title;
        this.type = type;
        this.volume = volume;
    }

    public String getCollateral() {
        return collateral;
    }

    public void setCollateral(String collateral) {
        this.collateral = collateral;
    }

    public int getContract_id() {
        return contract_id;
    }

    public void setContract_id(int contract_id) {
        this.contract_id = contract_id;
    }

    public String getDate_expired() {
        return date_expired;
    }

    public void setDate_expired(String date_expired) {
        this.date_expired = date_expired;
    }

    public String getDate_issued() {
        return date_issued;
    }

    public void setDate_issued(String date_issued) {
        this.date_issued = date_issued;
    }

    public int getDays_to_complete() {
        return days_to_complete;
    }

    public void setDays_to_complete(int days_to_complete) {
        this.days_to_complete = days_to_complete;
    }

    public int getEnd_location_id() {
        return end_location_id;
    }

    public void setEnd_location_id(int end_location_id) {
        this.end_location_id = end_location_id;
    }

    public int getIssuer_corporation_id() {
        return issuer_corporation_id;
    }

    public void setIssuer_corporation_id(int issuer_corporation_id) {
        this.issuer_corporation_id = issuer_corporation_id;
    }

    public int getIssuer_id() {
        return issuer_id;
    }

    public void setIssuer_id(int issuer_id) {
        this.issuer_id = issuer_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public int getStart_location_id() {
        return start_location_id;
    }

    public void setStart_location_id(int start_location_id) {
        this.start_location_id = start_location_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "collateral='" + collateral + '\'' +
                ", contract_id=" + contract_id +
                ", date_expired='" + date_expired + '\'' +
                ", date_issued='" + date_issued + '\'' +
                ", days_to_complete=" + days_to_complete +
                ", end_location_id=" + end_location_id +
                ", issuer_corporation_id=" + issuer_corporation_id +
                ", issuer_id=" + issuer_id +
                ", price=" + price +
                ", reward=" + reward +
                ", start_location_id=" + start_location_id +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", volume=" + volume +
                '}';
    }


}
