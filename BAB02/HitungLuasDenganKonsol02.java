import java.util.Scanner;

public class HitungLuasDenganKonsol02 {
	public static void main(String[] args){
		Scanner masukan = new Scanner(System.in);

		System.out.print("Masukan radius: ");
		double radius = masukan.nextDouble();

		// hitung luas
		double luas = (radius * radius)*3.14159;

		// hasil
		System.out.println("Luas lingkaran dengan radius "+radius+" adalah "+luas);
	}
}