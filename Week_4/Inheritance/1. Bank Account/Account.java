class Account {
    protected String accName;
    protected String accNo;
    protected String bankName;

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    protected void display() {
        System.out.println("Account Name:" + accName);
        System.out.println("Account Number:" + accNo);
        System.out.println("Bank Name:" + bankName);
    }
}
