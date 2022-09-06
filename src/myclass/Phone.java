package myclass;


public class Phone {
    /**
     * ID абонента
     */
    private int id;
    /**
     * Прізвище абонента
     */
    private String LName;
    /**
     * Ім'я абонента
     */
    private String FName;
    /**
     * По батькові абонента
     */
    private String fatherName;
    /**
     * Номер рахунку
     */
    private int accountNumber;
    /**
     * Час міських розмав
     */
    private int durationWithinCity;
    /**
     * Час міжміських розмов
     */
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

    @Override
    public String toString() {
        return id + " - " + LName + " " + FName + " " + fatherName +
                "; рахунок - " + accountNumber +
                "; час міських розмов - " + durationWithinCity +
                "; час міжміських розмов - " + durationOutCity;
    }
}
