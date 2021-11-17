package com.java_from_EPAM;

import java.time.LocalDate;

public class CustomerInfo {
    Customer[] customers=new Customer[5];
    {
        for (int i = 0; i < customers.length; i++) {
            customers[i] = new Customer(i,"Name"+1,"LastName"+2, LocalDate.of(1990+i,11-i,
                    5+i%4),new Address(i,"City"+i,"Street"+i,i*2),123546+i*4,
                    654879+i*3);
        }
        }
    }




