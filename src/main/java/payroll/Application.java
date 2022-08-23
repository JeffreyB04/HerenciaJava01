/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

import payroll.logic.*;
//implementar comissionEmployee
public class Application {
    public static void main(String[] args) { 
        Employee e;

//        System.out.println("===========================");
//        e = new SalariedEmployee("Juan","Perez","111",1000);
//        System.out.println(e.toString());
//
//        System.out.println("===========================");
//        e = new HourlyEmployee("Maria","Mata","222",10,45);
//        System.out.println(e.toString());

        e = new SalariedEmployee("Juan","Perez","111",1000);
        Service.agregar(e);
        e = new HourlyEmployee("Maria","Mata","222",10,45);
        Service.agregar(e);
        double total=0.0;
        double taxesT=0.0;
        for(Employee emp: Service.employees.values()){
            System.out.println("===========================");
            System.out.println(emp.toString()+"\n");
            total += emp.earnings();
            taxesT += emp.taxes();
        }
        System.out.println("TOTAL Taxes==> " + taxesT);
        System.out.println("TOTAL ==> " + total);
    }    
}

