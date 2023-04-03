public class Main {
    public static void main(String[] args) {

        int currentAmount = 120;
        int refill = 1500;
        int bonus = refill >= 1000 ? refill / 100 : 0;
        int finalScore = currentAmount + refill + bonus;

        // Второй вариант расчета бонуса
        // int bonus;
        // if (refill >= 1000) {
        // bonus = refill / 100;
        // } else {
        // bonus = 0;
        // }

        System.out.println("Итоговый счет:" + finalScore);
        System.out.println("Количество бонусов:" + bonus);
    }


}
