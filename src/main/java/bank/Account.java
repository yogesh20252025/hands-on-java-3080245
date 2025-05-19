package bank;

public class Account {
  private int Id;
  private String type;
  private double balance;

  public Account(int Id, String type, double balance) {
    setId(Id);
    setType(type);
    setBalance(balance);
  }

  public int getId() {
    return this.Id;
  }

  public void setId(int Id) {
    this.Id = Id;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public double getBalance() {
    return this.balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

}
