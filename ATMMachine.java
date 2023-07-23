import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class ATM{
    float balance;
    int PIN = 1000;
    public void checkpin()
    {
        System.out.println("Enter your PIN:");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        
        if(enteredpin==PIN)
        {
        menu();
        }
        else
        {
        System.out.println("Enter a valid PIN");
            
        }
    }
    public void menu()
    {
        System.out.println("Enter your Choice:");
        System.out.println("1. Check A/C Balance:");
        System.out.println("2. Withdraw Money:");
        System.out.println("3. Deposite Money:");
        System.out.println("4. Exit:");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt==1)
        {
            checkBalance();
        }
        else if(opt==2)
        {
            WithdrawMoney();
        }
        else if(opt==3)
        {
            DepositMoney();
        }
        else if(opt==4)
        {
            return;
        }
        else
        {
            System.out.println("Enter a valid Choice");
        }
    }
               
    public void checkBalance()
    {
        System.out.println("Balance:"+ balance);
        menu();
    }

    public void WithdrawMoney()
    {
        System.out.println("Enter amount to Withdraw :");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        if(amount>balance)
        {
            System.out.println("Insufficient Balance :");
        }
        else
        {

            balance = balance - amount;
            System.out.println("Money Withdrawl Successfully");
        }
        menu();
    }

    public void DepositMoney()
    {
        System.out.println("Enter the amount :");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        balance = balance + amount;
        System.out.println("Money Deposited Successfully");
        menu();

    }

}    

public class ATMMachine
{
    public static void main(String[] args) 
    {
        ATM obj = new ATM();
        obj.checkpin();
    }

}     

       


