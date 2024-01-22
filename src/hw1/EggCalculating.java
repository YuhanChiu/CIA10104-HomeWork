package hw1;

//2.請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)

public class EggCalculating {
	public static void main(String[] args) {
	int TotalEggs=200, EggSPerDozen =12;
	int a=TotalEggs/EggSPerDozen,b=TotalEggs%EggSPerDozen;
	System.out.println("200顆蛋共是" +a + "打" +b + "顆");
	}
}
