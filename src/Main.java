public class Main {

    public static void main(String[] args) {

        int start = 200;
        int add = 1500;


        boolean bonus1 = add > 1000;
        if (bonus1) {
            int bonus = add / 100;
            int amount = start + add + bonus;
            System.out.println("Бонус =" + bonus);
            System.out.println("Итоговая сумма =" + amount);
        } else {
            int bonus = 0;
            int amount = start + add;
            System.out.println("Бонус =" + 0);
            System.out.println("Итоговая сумма =" + amount);

        }


    }
}
