package hw1;

//3.請由程式算出256559秒為多少天、多少小時、多少分與多少秒
//Days=(24*60*60),Hours=(60*60),Mins=60;
public class TimeCalculating {
	public static void main(String[] args){
		int TotalSecs=256559;
		int Days=TotalSecs/(24*60*60);
		int RemainingSecs=TotalSecs %(24*60*60);
		int Hours=RemainingSecs/(60*60);
		RemainingSecs %= 3600;
		int Mins=RemainingSecs/60;
		int Secs=RemainingSecs%60;
		
		 System.out.println("256559為"+Days+"天"+
		 Hours+"小時"+Mins+"分鐘"+Secs+"秒");
	
	}
}
	

