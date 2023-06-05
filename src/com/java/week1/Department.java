package com.java.week1;

abstract class Department
{
    abstract int getDepartmenSize();


}
class Department_subclass extends Department
{
    public static void main(String[] args)
    {
        Department_subclass obj=new Department_subclass();

        System.out.println("Number of Departments:"+obj.getDepartmenSize());
    }
    @Override
    int getDepartmenSize() {
        int Dept=10;

        return Dept;
    }
}