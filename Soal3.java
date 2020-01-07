import java.text.DecimalFormat;

public class Soal3{
    public static void main(String[] args){

        DecimalFormat des = new DecimalFormat();
        int anak = 4;
        double gajiPokok = 4600897;
        double persen= gajiPokok/100;
        double tunjanganSuami = persen*10;
        double tunjanganAnak = (persen*2)*anak;
        double iuranPensiun = persen*4;
        double bruto = gajiPokok+tunjanganSuami+tunjanganAnak;
        double netto = bruto-iuranPensiun;

        System.out.println("BRUTO      = "+des.format(bruto));
        System.out.println("NETO       = "+des.format(netto));

    }
}