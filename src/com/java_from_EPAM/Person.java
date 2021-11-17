package com.java_from_EPAM;
import java.time.LocalDate;

public class Person {
    private int id;
    private String name;
    private String lastName;
    private LocalDate dateOfBirth;
    private Address address=new Address();

   public Person(int id, String name, String lastName, LocalDate dateOfBirth, Address address){
       this.id=id;
       this.name=name;
       this.lastName=lastName;
       this.dateOfBirth=dateOfBirth;
       this.address=address;
   }

    public Person(){
   }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
