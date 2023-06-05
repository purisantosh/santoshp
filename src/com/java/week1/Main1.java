package com.java.week1;

class Product
{
    double price=15;
        public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void getPrice(int quantity)
    {
        System.out.println(quantity * price);
    }

}
public class Main1{
    public static void main(String[] args)
    {
        Product p=new Product();
        p.getPrice(10);
    }
}