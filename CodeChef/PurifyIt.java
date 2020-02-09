import java.util.Scanner;

public class PurifyIt{

	public static String inputString="";
	public static Scanner sc;
	public static int count=0;

	public static ONE_COUNT = oneCount();
	public static ZERO_COUNT = zeroCount();
		
	public static void main(String arg[]){
		sc = new Scanner(System.in);
		if(sc.hasNextInt()){
			int T = sc.nextInt();
			sc.nextLine();
			while(T>0){
				inputString = sc.nextLine();
				validator();
				System.out.println(count);
				T--;
			}
		}
	}

	public static int zeroCount(){
		return inputString.length() - inputString.replace("0","").length();
	}

	public static int oneCount(){
		return inputString.length() - inputString.replace("1","").length();
	}

	public static void validator(){

		if(ZERO_COUNT>ONE_COUNT){
			// operation on 1
			if(ONE_COUNT>1){
				purifier(1);
			}
		}else{
			//operation on 0
			if(ZERO_COUNT){
				purifier(0)
			}
		}
		
	}

	public static void purifier(int value){
			System.out.println("String processed = "  +inputString);
			int startIndex = inputString.indexOf(SQ_1);
			System.out.println("startIndex = " + startIndex);
			if(startIndex!=-1){
				inputString = inputString.replaceFirst(SQ_1,SQ_1_REPLACE);
				System.out.println("String replaced SQ1 = "  +inputString);
				count++;
				purifyIt();
			}
		
	}
}