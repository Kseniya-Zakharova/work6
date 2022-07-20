public class Main {
    public static void main(String[] args) {

        int initialAccount = 100;
                int depositAmount = 4000;
                int bonus = 0;

                if (depositAmount > 1000) {
                    bonus = depositAmount / 100;}
                int finalScore = bonus + initialAccount + depositAmount;

                System.out.println(finalScore);
                        System.out.println(bonus);
    }
}