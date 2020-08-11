import java.util.Scanner;

public class TampilParagraf07 {
	public static void main(String[] args){
		Scanner masukan = new Scanner(System.in);
		System.out.print("masukan paragraf: ");
		String s = masukan.nextLine();
		System.out.println("String yang anda masukan: "+s);
	}
}