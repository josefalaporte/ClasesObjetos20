/*Diseñe  la  clase  Cuenta  que  permita  manejar  operaciones  de  una  cuenta  bancaria  (cuenta
RUT).  En  particular,  identifique  los  atributos  necesarios  y  cree  constructores  y  métodos  get-set
apropiados. Las operaciones mínimas que se deben poder realizar con la cuenta son depositar
una cantidad dada de dinero y girar.*/

public class Account {
    private String numAccount;
    private double balance;


    public Account (String numAccount, double balance){
        this.numAccount = numAccount;
        this.balance = balance;
    }
    public String getNumAccount(){    //Número de cuenta
        return numAccount;
    }

    public void setNumAccount(String numAccount){
        this.numAccount = numAccount;
    }

    public double getBalance(){   //Saldo
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void deposit (double amount){  //Depósito de dinero
        if (amount > 0){
            balance += amount;
            System.out.println("Depósito realizado. Tu nuevo saldo es: " + balance);
        }else{
            System.out.println("La cantidad a dempositar debe ser mayor a $300");
        }
    }

    public void cashOut(double amount){  //Retiro de dinero
        if(balance > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Retiro exitoso, tu nuevo saldo es: " + balance);
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public static void main(String[] args) {
        Account account = new Account("12456789", 5000);
        System.out.println("Saldo inicial de la cuenta: " + account.getBalance());
        account.deposit(500);
        account.cashOut(200);
    }
}