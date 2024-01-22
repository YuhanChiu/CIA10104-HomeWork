package hw1;
//請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//5 + 5
//5 + ‘5’
//5 + “5” 並請用註解各別說明答案的產生原因
public class PrintDifferences {
	    public static void main(String[] args) {
	        int result1 = 5 + 5;
	        System.out.println("答案1：" + result1);
	        //簡單的整數相加,5+5=10

	     
	        int result2 = 5 + '5';
	        System.out.println("答案2：" + result2);
	        //'5'的ASCII值是53，所以相當於5+53，答案是58

	      
	        String result3 = 5 + "5";
	        System.out.println("答案3：" + result3);
	        //整數 5 轉換為字串並與字串 "5" 相接，答案是55
	    }
	}

