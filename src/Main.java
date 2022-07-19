public class Main {
    public static void main(String[] args) {

        int initialAccount = 200;
                int depositAmount = 500;
                int bonus = 0;

                if (depositAmount > 1000) {
                    bonus = depositAmount / 100;}
                int finalScore = bonus + initialAccount + depositAmount;

                System.out.println(finalScore);
                        System.out.println(bonus);
    }
}