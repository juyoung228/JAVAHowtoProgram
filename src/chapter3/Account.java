package chapter3;

public class Account{
    /*
    //Fig.3.1
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
            return name;
    }

     */

    /*
    //Fig.3.5
    private String name;

    //constructor initializes name with parameter name
    public Account(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

     */

    //figure3.8
    private String name;
    private double balance;

    public Account(String name, double balance){
        this.name = name; //assign name to instance variable name
        //'this' is used to refer to the shadowed instance variable explicitly.

        //validate that the balance is greater than 0.0; if it's not,
        //instance variable balance keeps its default initial value of 0.0
        if(balance > 0.0) {
            this.balance = balance;
        }
    }

    public void deposit(double depositAmount){
        if(depositAmount > 0.0) {
            balance = balance + depositAmount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
