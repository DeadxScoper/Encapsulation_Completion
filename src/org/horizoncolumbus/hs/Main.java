package org.horizoncolumbus.hs;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee farah = new Employee(1000000);
        // System.out.println(farah.salary);

        //initial salary
        System.out.println("$" + farah.getSalary());

        // 10 percent increase
        farah.setSalary((int) ((farah.getSalary() * .1) + farah.getSalary()));
        System.out.println("$" + farah.getSalary());

    }
}


