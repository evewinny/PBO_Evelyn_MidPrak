class merekO extends input{
	private int harga;
	private int bayar;
	private int total;
	private int kembali;
	
	public void Harga() {
		harga=0;
		switch(tipe) {
			case 'M': harga = 115000;
			break;
			case 'K' : harga = 145000;
			break;
			case 'L' : harga = 550000;
			break;
			default: System.out.println("Tipe yang anda pilih salah");
			System.exit(0);
		}
	}
	
	public void TotalHarga() {
		total = jumlah*harga;
		System.out.println("Totalnya adalah: Rp."+total);
	}
	
	public void setBayar(int bayar) {
		this.bayar=bayar;
	}
	
	public void kembali() {
		kembali = bayar - total;
		System.out.println("Kembalian: Rp."+kembali);
	}
}