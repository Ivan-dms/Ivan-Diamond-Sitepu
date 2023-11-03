import java.util.Scanner;

public class testingAOK {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("MENU");
            System.out.println("0. KELUAR");
            System.out.println("1. Konversi Desimal ke Biner");
            System.out.println("2. Konversi Biner ke Desimal");
            System.out.println("3. Konversi Biner ke Heksadesimal");
            System.out.println("4. Konversi Heksadesimal ke Biner");
            System.out.println("5. Konversi Desimal ke Heksadesimal");
            System.out.println("6. Konversi Heksadesimal ke Desimal");

            System.out.print("MASUKKAN PILIHAN ANDA: ");
            pilihan = scan.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan bilangan desimal: ");
                    int desimal = scan.nextInt();
                    String biner = Integer.toBinaryString(desimal);
                    System.out.printf("Konversi ke biner: %s\n", biner);
                    break;
                case 2:
                    System.out.print("Masukkan bilangan biner: ");
                    String binerInput = scan.next();
                    int desimalFromBiner = Integer.parseInt(binerInput, 2);
                    System.out.printf("Konversi ke desimal: %d\n", desimalFromBiner);
                    break;
                case 3:
                    System.out.print("Masukkan bilangan biner: ");
                    String binerToHeksadesimalInput = scan.next();
                    int desimalFromBinerToHeksadesimal = Integer.parseInt(binerToHeksadesimalInput, 2);
                    String heksadesimal = Integer.toHexString(desimalFromBinerToHeksadesimal);
                    System.out.printf("Konversi ke heksadesimal: %s\n", heksadesimal);
                    break;
                case 4:
                    System.out.print("Masukkan bilangan heksadesimal: ");
                    String heksadesimalToBinerInput = scan.next();
                    int desimalFromHeksadesimalToBiner = Integer.parseInt(heksadesimalToBinerInput, 16);
                    String binerFromHeksadesimal = Integer.toBinaryString(desimalFromHeksadesimalToBiner);
                    System.out.printf("Konversi ke biner: %s\n", binerFromHeksadesimal);
                    break;
                case 5:
                    System.out.print("Masukkan bilangan desimal: ");
                    int desimalToHeksadesimal = scan.nextInt();
                    String heksadesimalFromDesimal = Integer.toHexString(desimalToHeksadesimal);
                    System.out.printf("Konversi ke heksadesimal: %s\n", heksadesimalFromDesimal);
                    break;
                case 6:
                    System.out.print("Masukkan bilangan heksadesimal: ");
                    String heksadesimalToDesimalInput = scan.next();
                    int desimalFromHeksadesimal = Integer.parseInt(heksadesimalToDesimalInput, 16);
                    System.out.printf("Konversi ke desimal: %d\n", desimalFromHeksadesimal);
                    break;
                case 0:
                    System.out.println("Terima Kasih! Program selesai. ");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan pilih kembali");
            }
        } while (pilihan != 0);

        scan.close();
    }
}
