package activity4;

/*
* ### 👨‍💻 Activity 3 - Vending Machine
This vending machine will have a `makePayment` method that takes in a `double` amount and outputs to the console that the payment was accepted.
It should also have another overloaded method that takes in an `enum` `EPayment`.

```java
enum Epayment {
  PAYNOW, GRABPAY, FAVEPAY
}
```

This overloaded `makePayment` method will accept the enum and call the respective `private` method i.e. `connectPayNow()`, `connectGrabPay()`, `connectFavePay()`. You can just return `true` or `false` in these methods for simulating the payment status.

Test code

```java
VendingMachine myVendingMachine = new VendingMachine();
myVendingMachine.makePayment(10.0); // cash
myVendingMachine.makePayment(EPayment.GRABPAY); // cashless, no amount needed
myVendingMachine.makePayment(EPayment.FAVEPAY);
myVendingMachine.makePayment(EPayment.PAYNOW);
```
 */

public class VendingMachine {
  public static void main(String[] args) {
    // /VendingMachine myVendingMachine = new VendingMachine();
    // myVendingMachine.makePayment(10.0); // cash
    // myVendingMachine.makePayment(EPayment.GRABPAY); // cashless, no amount needed
    // myVendingMachine.makePayment(EPayment.FAVEPAY);
    // myVendingMachine.makePayment(EPayment.PAYNOW);
  }

  public static makePayment(double amount) {
    //
  }
}
