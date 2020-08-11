import java.util.Scanner;

public class HitungRata03 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		// input
		System.out.print("Masukan tiga angka: ");
		double angka1 = input.nextDouble();
		double angka2 = input.nextDouble();
		double angka3 = input.nextDouble();

		// hitung rata-rata
		double rata2 = (angka1+angka2+angka3)/3;

		// tampilkan hasil
		System.out.println("Nilai dari rata-rata: "+rata2);
	}
}
