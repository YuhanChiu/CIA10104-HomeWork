package hw2;

//請設計一隻Java程式，輸出結果為以下：1 4 9 16 25 36 49 64 81 100

public class Print {
    public static void main(String[] args) {
        int a, i = 1;

        for (a = 1; i <= 10; i++) {
            a = i * i;
        System.out.print(a + " ");
        }
        System.out.println();
    }
}