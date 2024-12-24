package exercise3;

/*
Создайте класс "Банковский Счет", который будет представлять собой счет в банке.
Реализуйте методы для пополнения и снятия денег со счета, а также метод для вывода текущего баланса.
 */

import java.math.BigDecimal;

public class BankAccount {
    private BigDecimal accountVolume;

    BankAccount() {
        accountVolume = new BigDecimal("0.0");
    }

    public void replenishmentBalance (double value) {
        try {
            accountVolume = accountVolume.add(new BigDecimal(Double.toString(value)));
        }
        catch(ArithmeticException e) {
           System.out.println("Something was wrong.");
        }
    }

    public void withdrawalBalance(double value) {
        try {
            accountVolume = accountVolume.subtract(new BigDecimal(Double.toString(value)));
        }
        catch (ArithmeticException e) {
            System.out.println("Something was wrong.");
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountVolume=" + accountVolume +
                '}';
    }

    public void printAccountVolume() {
        System.out.println(this);
    }

//    public static void main(String[] args) {
//        BankAccount test = new BankAccount();
//        test.replenishmentBalance(10000);
//        test.withdrawalBalance(300.3);
//        test.printAccountVolume();
//    }
}

