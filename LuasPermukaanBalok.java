public class LuasPermukaanBalok {
    public static void main(String[] args) {

        int p = 10; // panjang
        int l = 5;  // lebar
        int t = 4;  // tinggi
        
        int luasPermukaan = 2 * ((p * l) + (p * t) + (l * t));
        
        System.out.println("Menghitung Luas Permukaan Balok");
        System.out.println("Panjang = " + p);
        System.out.println("Lebar   = " + l);
        System.out.println("Tinggi  = " + t);
        System.out.println("===============================");
        System.out.println("Luas Permukaan = " + luasPermukaan);
    }
}
