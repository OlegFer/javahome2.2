public class Main {
    public static void main(String[] args) {
        int currentBalance = 100; // начальный баланс
        int rechargeAmount = 1100; // сумма пополнения
        int bonusRubles = 0; // количество бонусных рублей
        if (rechargeAmount > 1000) {
            bonusRubles = rechargeAmount / 100;
        }
        int totalBalance = currentBalance + rechargeAmount + bonusRubles;
        System.out.println("Итоговый счёт: " + totalBalance + " рублей");
        System.out.println("Количество бонусных рублей: " + bonusRubles);
    }
}