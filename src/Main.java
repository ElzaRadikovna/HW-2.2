public class Main {

    public static void main(String[] args) {

        int start = 200;
        int add = 1001;
        int amount;
        int bonus;

        boolean bonus1 = add > 1000;
        if (bonus1) {
            bonus = add / 100;
            amount = start + add + bonus;
            System.out.println("Бонус =" + bonus);
            System.out.println("Итоговая сумма =" + amount);
        } else {
            bonus = 0;
            amount = start + add;
            System.out.println("Бонус =" + 0);
            System.out.println("Итоговая сумма =" + amount);

        }


    }
}
