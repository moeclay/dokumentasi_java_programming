import javax.swing.JOptionPane;

public class Dialog08 {
	public static void main(String[] args){
		
		// input 1
		String a1s = JOptionPane.showInputDialog("suku bunga tahunan: ");
		// convert to double
		double a1 = Double.parseDouble(a1s);

		double a2 = a1/1200;

		// input 2
		String b1s = JOptionPane.showInputDialog("masukan jumlah tahun: ");
		int b1 = Integer.parseInt(b1s);

		//input 3
		String c1s = JOptionPane.showInputDialog("masukan jumlah pinjaman: ");
		double c1 = Double.parseDouble(c1s);

		// hitung pembayaran
		double d1 = c1 * a2 / (1-1 / Math.pow(1 + a2, b1 * 12));
		double d2 = d1 * b1 * 12;
		
		d1 = (int)(d1 * 100) / 100.0;
		d2 = (int)(d2 * 100) / 100.0;

		// output
		String output = "Pembayaran bulanan: "+d1+"\nTotal pembayaran: "+d2;
		JOptionPane.showMessageDialog(null, output);
	}
}