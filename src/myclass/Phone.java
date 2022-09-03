package myclass;


public class Phone {
    private int id;
    private String LName;
    private String FName;
    private String fatherName;
    private int accountNumber;
    private int durationWithinCity;
    private int durationOutCity;

    public Phone(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getDurationWithinCity() {
        return durationWithinCity;
    }

    public void setDurationWithinCity(int durationWithinCity) {
        this.durationWithinCity = durationWithinCity;
    }

    public int getDurationOutCity() {
        return durationOutCity;
    }

    public void setDurationOutCity(int durationOutCity) {
        this.durationOutCity = durationOutCity;
    }

    //TODO: Rewrite ToString()
    @Override
    public String toString() {
        return id + " - " + LName + " " + FName + " " + fatherName +
                " рахунок - " + accountNumber +
                " час міських розмов - " + durationWithinCity +
                " час міжміських розмов - " + durationOutCity;
    }
}
