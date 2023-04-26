public class Main {
    public static void main(String[] args) {
        String anyWord;
        final int NUM = 25;
        String world = "world";
        anyWord = "лююое слово";

        System.out.println(anyWord + NUM + " " + " " + world);
        if (NUM < 0 ) {
            System.out.println("Вы сохронили отрицательное число");
        } if (NUM > 0){
            System.out.println("Вы сохронили положительное число");
        }else {
            System.out.println("Вы сохронили 0");
        }
    }
}