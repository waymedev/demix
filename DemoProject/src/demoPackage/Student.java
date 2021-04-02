package demoPackage;

import java.sql.SQLOutput;

public class Student extends Person {

    private int coefficients;


    public Student(String name, int age, int gender, float height, float workDay, String type)
    {
        super(name, age, gender, height, workDay);
        this.coefficients = coefficients;

    }



    @Override
    public void inPut() {
        System.out.println("STUDENT:");
        super.inPut();
        System.out.println("Text your coefficients: ");
        this.coefficients = sc.nextInt();
    }

    public int NetSalary()
    {
        return (int) (this.workDay * this.coefficients + 1200000);
    }

    @Override
    public void outPut() {
        System.out.println("STUDENT:");
        super.outPut();
        System.out.println("Your NetSalary: "+ NetSalary());
    }
}
