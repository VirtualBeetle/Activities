class CurrentAccount extends Account {
    private String tinNumber;

    public CurrentAccount(String accName, String accNo, String bankName, String tinNumber) {
        setAccName(accName);
        setAccNo(accNo);
        setBankName(bankName);
        this.tinNumber = tinNumber;
    }

    public void setTinNumber(String tinNumber) {
        this.tinNumber = tinNumber;
    }

    public String getTinNumber() {
        return tinNumber;
    }

    public void display() {
        super.display();
        System.out.println("TIN Number:" + tinNumber);
    }
}
