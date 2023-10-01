import java.util.Scanner;
public class tugaskelompok {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);

        String namabarang , kodebarang;
        System.out.println("Masukkan Nama barang :  ");
        namabarang = input21.nextLine();
        System.out.println("Masukkan Kode barang :  ");
        kodebarang = input21.nextLine();

        if(namabarang.equals("sapu") || namabarang.equals("baju") ||namabarang.equals("celana") &&
         (kodebarang.equals("a76") || kodebarang.equals("b76") || kodebarang.equals("c76"))){
            System.out.println("Nama Barang : "+namabarang);
            System.out.println("Kode Barang :"+kodebarang);
         }else{
            System.out.println("Barang tidak ditemukan");
         }

    }
    
}
