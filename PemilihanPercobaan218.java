import java.util.Scanner;
public class PemilihanPercobaan218 {
    public static void main(String[] args) {

        Scanner input00 = new Scanner(System.in);
        System.out.println("Nilai uas   : ");
        float uas = input00.nextFloat();
        System.out.println("Nilai uts   : ");
        float uts = input00.nextFloat();
        System.out.println("Nilai kuis  : ");
        float kuis = input00.nextFloat();
        System.out.println("Nilai tugas : ");
        float tugas = input00.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String message = total < 65 ? "Remidi" : "Tidak remidi";
        if (total >=80 && total <100){
            message= "Nilai Huruf   : A";
        }else if (total >=73 && total <80){
            message= "Nilai Huruf   : B+";
        
        }else if (total >=65 && total <73){
            message= "Nilai Huruf   : B";
        }else if (total >=60 && total<65){
            message= "Nilai Huruf   : C+";
        }else if (total >=50 && total<60){
            message= "Nilai Huruf   : C";
        }else if (total >=39 && total<50){
            message= "Nilai Huruf   : D";
        }else if (total >=0 && total<39){
            message= "Nilai Huruf   : E";
        }

        System.out.println("Nilai akhir = " + total + " sehingga "+ message);

    }
}
