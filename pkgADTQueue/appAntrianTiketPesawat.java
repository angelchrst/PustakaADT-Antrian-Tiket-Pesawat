package pkgADTQueue;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
public class appAntrianTiketPesawat {
	public static void main(String[] args) {
		int bagasi;
	    int hargaTiket=700000;
	    int hargaBagasi=4400;
	    String noAntrian,nama,bandaraAsal,bandaraTujuan;
		Queue q = new LinkedList();
		Scanner s = new Scanner(System.in);
		int pilih=0;
		do {
			System.out.println("\nMENU PEMBELIAN TIKET PESAWAT");
        	System.out.println("1. Ambil nomor antrian");
        	System.out.println("2. Panggil antrian");
        	System.out.println("3. Daftar antrian");
        	System.out.println("4. Keluar");
        	System.out.print("Pilih = ");
        	pilih=s.nextInt();
			switch(pilih) {
			case 1:
				System.out.print("Masukkan nomor antrian: ");
		        noAntrian = s.next();
		        q.add(noAntrian);
				break;
				
			case 2:
				if(q.size()>0) {
					System.out.println("PANGGILAN UNTUK NOMOR ANTRIAN SELANJUTNYA");
					q.poll();
					System.out.print("Masukkan bandara asal: ");
					bandaraAsal=s.next();
					System.out.print("Masukkan bandara tujuan: ");
					bandaraTujuan=s.next();
					System.out.print("Masukkan berat bagasi: ");
					bagasi=s.nextInt();
					int totalBagasi=bagasi*hargaBagasi;
					int totalBayar=totalBagasi+hargaTiket;
					System.out.println("Bandara Asal: "+bandaraAsal);
					System.out.println("Bandara Tujuan: "+bandaraTujuan);
					System.out.println("Harga Bagasi: "+totalBagasi);
					System.out.println("Total Bayar: "+totalBayar);
				}
				else {
					System.out.println("ANTRIAN KOSONG!");
				}
				break;
				
			case 3:
				if(q.size()>0) {
					System.out.println("DAFTAR ANTRIAN");
					System.out.println(q);
				}
				else {
					System.out.println("ANTRIAN KOSONG!");
				}
				break;
				
			case 4:
				System.out.println("~~ TERIMA KASIH ~~");
				break;
			}
		}while(pilih!=4);

	}

}
