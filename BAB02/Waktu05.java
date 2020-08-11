import java.util.Scanner;

public class Waktu05 {
	public static void main(String[] args){
		Scanner masukan = new Scanner(System.in);

		System.out.print("Masukan input detik: ");
		int detik = masukan.nextInt();
		int menit = detik/60;
		int sisaDetik = detik % 60;

		// hasil
		System.out.println(menit+" menit dan "+sisaDetik+" detik.");
	}
}
