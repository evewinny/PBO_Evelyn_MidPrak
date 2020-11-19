import java.util.Scanner;

public class main{
	public static void main(String[] args) {
		String nama;
		
		nama n = new nama(); 
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nama anda: ");
		nama=input.nextLine();
		System.out.println();
		
		System.out.println("Merek yang tersedia: ");
		System.out.println("---------------------");
		System.out.println("Merek G");
				System.out.println("Meja(M) - Rp.95,000");
				System.out.println("Kursi(K) - Rp.125,000");
				System.out.println("Lemari(L) - Rp.450,000");
		System.out.println("---------------------");
		System.out.println("O");
				System.out.println("Meja(M) - Rp.115,000");
				System.out.println("Kursi(K) - Rp.135,000");
				System.out.println("Lemari(L) - Rp.550,000");
				
		System.out.print("Pilihan anda? ");
		char m = input.next().charAt(0);
		System.out.println("Tipe yang anda inginkan?");
		char t = input.next().charAt(0);
		System.out.println("Masukkan jumlah yang ingin anda beli: ");
		byte j = input.nextByte();
		System.out.println();
		
		
		switch(m){
			case 'G':
			merekG G = new merekG();
			G.setMerek(m);
			G.setTipe(t);
			G.setjumlah(j);
			G.Harga();
			G.TotalHarga();
				System.out.print("Pembayaran: ");
				int pay=input.nextInt();
				G.setBayar(pay);
				G.kembali();
			break;
			case 'O':
			merekO O = new merekO();
			O.setMerek(m);
			O.setTipe(t);
			O.setjumlah(j);
			O.Harga();
			O.TotalHarga();
				System.out.println("Pembayaran: ");
				int pay2=input.nextInt();
				O.setBayar(pay2);
				O.kembali();
			break;
		default: System.out.println("Tipe Salah");
		}
	}
}