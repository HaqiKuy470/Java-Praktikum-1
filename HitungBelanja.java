public class HitungBelanja {
    public static void main(String[] args) {

        int hargaNasiGoreng = 15000;
        int hargaEsTeh = 3000;

        int jumlahNasi = 2;
        int jumlahTeh = 3;
        
        int totalNasi = hargaNasiGoreng * jumlahNasi;
        int totalTeh = hargaEsTeh * jumlahTeh;
        int totalBayar = totalNasi + totalTeh;
        
        int uangDiberikan = 50000;
        
        int kembalian = uangDiberikan - totalBayar;
        
        System.out.println("=== STRUK PEMBELIAN ===");
        System.out.println("2 Nasi Goreng : Rp " + totalNasi);
        System.out.println("3 Es Teh      : Rp " + totalTeh);
        System.out.println("-----------------------");
        System.out.println("Total Belanja : Rp " + totalBayar);
        System.out.println("Uang Tunai    : Rp " + uangDiberikan);
        System.out.println("Kembalian     : Rp " + kembalian);
    }
}
