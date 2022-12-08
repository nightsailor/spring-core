package com.spring.app;

// import java.util.*;
// import java.util.Scanner;

public class Driver {
  public Customer getCustomer() {
    System.out.println("Enter customer details:");
    System.out.println("Enter\n1. custId\n2. custName\n3. emailId\n4. contactNo");

    return new Customer(12, "rehan", "rehan@com", 1234567892);
  }

  public MemberShip getMemberShip(Customer customer) {
    System.out.println("Enter membership details:");
    System.out.println("Enter\n1. membershipId\n2. membershipType\n3. visitsPerYear");

    return new MemberShip(22, "monthly", 365, customer);
  }

  public static void main(String[] args) {
    Driver mains = new Driver();

    Customer cust = mains.getCustomer();
    MemberShip mship = mains.getMemberShip(cust);

    System.out.println("1. Customer Details:");
    System.out.println(cust.getCustId() + "\n" + cust.getCustName() + "\n" +
        cust.getEmailId() + "\n" + cust.getContactNo());

    System.out.println("1. MemberShip Details:");
    System.out.println(mship.getMembershipId() + "\n" + mship.getMembershipType() + "\n" +
        mship.getVisitsPerYear() + "\n" + mship.getCustomer());
  }

}
