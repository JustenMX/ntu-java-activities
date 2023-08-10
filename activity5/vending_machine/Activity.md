Create a `VendingMachine` class to represent the vending machine.

It should have the following attributes:

- `String location` - location of vending machine
- ` double earnings` - total earnings of machine
- `double balance` - how much money user has inserted

Methods:

- `insertCoin` - for receiving payment
- `selectDrink` - for selecting a drink
- `getPrice` - for getting the price of a drink
- `dispenseDrink` - for dispensing a drink
- `printEarnings` - prints out the total earnings

Test code:

```java
VendingMachine ntuVendingMachine = new VendingMachine("NTU");

ntuVendingMachine.insertCoin(1);
ntuVendingMachine.selectDrink(Drink.COKE); // should not dispense, insufficient payment
ntuVendingMachine.insertCoin(0.5);
ntuVendingMachine.selectDrink(Drink.COKE);

ntuVendingMachine.insertCoin(0.5); // should not dispense, insufficient payment
ntuVendingMachine.selectDrink(Drink.WATER);
ntuVendingMachine.insertCoin(1);
ntuVendingMachine.selectDrink(Drink.WATER);

ntuVendingMachine.printEarnings();
```

Optional Challenge: Store the transactions history.
