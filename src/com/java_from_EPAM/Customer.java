package com.java_from_EPAM;

import java.time.LocalDate;

public class Customer extends Person{
   private int numberOfCreditCard;
   private int numberOfBankAccount;

   public Customer(int id, String name, String lastName, LocalDate dateOfBirth, Address address, int numberOfCreditCard,
                   int numberOfBankAccount) {
      super(id, name, lastName, dateOfBirth, address);
      this.numberOfCreditCard = numberOfCreditCard;
      this.numberOfBankAccount=numberOfBankAccount;
   }
   public Customer(int i, String s, String s1, LocalDate of) {
   }
  public int getNumberOfCreditCard(){
      return numberOfCreditCard;
  }
  public void setNumberOfCreditCard(int numberOfCreditCard){
       this.numberOfCreditCard=numberOfCreditCard;
  }
  public int getNumberOfBankAccount(){
       return numberOfBankAccount;
  }
  public void setNumberOfBankAccount(){

  }

}
