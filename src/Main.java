public class Main {
    public static void main(String[] args) {

        int currentBalance = 300;
        int incomeAmount = 3750;
        int bonusAmount = incomeAmount / 100;


        if (incomeAmount >= 1000) {
            System.out.println("Ваш баланс: " + (currentBalance + incomeAmount + bonusAmount) + " руб.\nСумма вашего бонуса составляет: " + bonusAmount + " руб.") ;
        } else {
            System.out.println("Ваш баланс: " + (currentBalance + incomeAmount) + " руб.\nДля получения бонуса пополните ваш баланс на сумму от 1000 рублей ");
        }


    }
}
