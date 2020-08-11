import java.util.Scanner;

public class TampilString06 {
	public static void main(String[] args){
		Scanner masukan = new Scanner(System.in);
		
		// input
		System.out.print("masukan 3 string: ");
		String s1 = masukan.next();
		String s2 = masukan.next();
		String s3 = masukan.next();

		// output
		System.out.println("s1 adalah "+s1);
		System.out.println("s2 adalah "+s2);
		System.out.println("s3 adalah "+s3);
	}
}
