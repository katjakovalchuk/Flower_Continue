package ua.edu.ucu.apps.lab7.payment;

public class PayPalCreditStrategy implements Payment{
    @Override
    public void pay(double price) {
        System.out.println("Pay by Pay Pal:" + price);
    }
}
