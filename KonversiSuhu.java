public class KonversiSuhu {
    public static void main(String[] args) {
        double celcius = 30.0;

        double reamur = celcius * 0.8;
        double fahrenheit = (celcius * 1.8) + 32;
        double kelvin = celcius + 273.15;
        
        System.out.println("Program Konversi Suhu");
        System.out.println("Suhu Awal (Celcius) = " + celcius);
        System.out.println("-----------------------------");
        System.out.println("Hasil Reamur      = " + reamur);
        System.out.println("Hasil Fahrenheit  = " + fahrenheit);
        System.out.println("Hasil Kelvin      = " + kelvin);
    }
}
