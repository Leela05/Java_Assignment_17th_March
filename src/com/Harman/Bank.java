/*
2. Create an interface 'Bank' with a method 'getBalance'.
$100, $150 and $200 are deposited in banks A, B and C respectively.
'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank',
each having a method named 'getBalance'.
Call this method by creating an object of each of the three classes.
 */

package com.Harman;

public interface Bank {

}
class BankA implements Bank{
    void getBalance(){
        System.out.println("$100");
    }
}
class BankB implements Bank{
    void getBalance(){
        System.out.println("$150");
    }
}
class BankC implements Bank{
    void getBalance(){
        System.out.println("$200");
    }
}
class Result{
    public static void main(String[] args) {
        BankA bankA_obj=new BankA();
        BankB bankB_obj=new BankB();
        BankC bankC_obj=new BankC();
        bankA_obj.getBalance();
        bankC_obj.getBalance();
        bankC_obj.getBalance();
    }
}