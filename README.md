# Task 5 – Bank Account Simulation

## Objective
Create a **CLI-based Bank Account Management System** in Java using **Object-Oriented Programming** concepts like inheritance, method overriding, encapsulation, and constructors.

---------------------------

## Tools & Technologies
- Java (JDK 8 or above)
- Eclipse IDE

---------------------------

## Features
- Create **Savings Account** with interest
- Create **Current Account** with overdraft facility
- Deposit and withdraw money
- Apply interest to savings account
- View transaction history
- Overdraft protection for current accounts

--------------------------

## Class Structure

### `Account.java`
- **Purpose**: Base class containing common account details and methods.
- **Methods**:
  - `deposit(double amount)`
  - `withdraw(double amount)`
  - `printTransactions()`

### `SavingsAccount.java` (extends Account)
- **Additional Field**: `interestRate`
- **Method**: `addInterest()` to apply interest to balance.

### `CurrentAccount.java` (extends Account)
- **Additional Field**: `overdraftLimit`
- **Overridden Method**: `withdraw()` to allow overdraft.

### `Main.java`
- CLI menu for account operations.

--------------------------

## Folder Structure (Eclipse)

BankApp/
└── src/
└── bank/
├── Account.java
├── SavingsAccount.java
├── CurrentAccount.java
└── Main.java

-------------------------

## How to Run (In Eclipse)

1. **Open Eclipse IDE**
2. **File → New → Java Project** → Name: `BankApp`
3. **Right-click `src` → New → Package** → Name: `bank`
4. Create the `.java` files in `bank` package
5. Paste respective code into each file
6. **Right-click `Main.java` → Run As → Java Application**

--------------------------

## Sample Output

------------- Bank Account Menu --------------
1. Deposit (Savings)
2. Withdraw (Savings)
3. Add Interest (Savings)
4. Deposit (Current)
5. Withdraw (Current)
6. View Transactions
7. Exit
   Enter choice: 1
   Enter amount: 500
   Deposited: 500

------------------------

## Outcome
By completing this task, you’ll:
- Understand **inheritance** and **method overriding**
- Work with **encapsulation** and **constructors**
- Apply **real-world OOP principles** in Java
