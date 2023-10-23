// package ua.edu.ucu.apps.lab7;

// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;

// import ch.qos.logback.core.subst.Token.Type;
// import ua.edu.ucu.apps.lab7.payment.CreditCardPaymentStrategy;
// import ua.edu.ucu.apps.lab7.payment.PayPalCreditStrategy;
// import ua.edu.ucu.apps.lab7.payment.Payment;
// import ua.edu.ucu.apps.lab7.payment.PaymentService;

// import org.junit.jupiter.api.Assertions;

// public class PaymentTest {
//     // private Payment payment;
//     private PaymentService paymentService;
//     private PayPalCreditStrategy payPalStrategy;
//     private CreditCardPaymentStrategy creditCardPaymentStrategy;

//     @BeforeEach
//     public void init() {
//         // payment = new Payment() {

//         paymentService = new PaymentService();
//         payPalStrategy = new PayPalCreditStrategy();
//         creditCardPaymentStrategy = new CreditCardPaymentStrategy();
//     };

//     @Test
//     public void tetsPaymentStrategy() {
//         PaymentService paymentService;
//         PayPalCreditStrategy payPalStrategy;
//         CreditCardPaymentStrategy creditCardPaymentStrategy;

//         Assertions.assertEquals(paymentService.getClass() == PaymentService.class, true);
//         // Assertions.assertNotEquals(paymentService.pay(50), "Pay 50");
//     }
// }
