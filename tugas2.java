package Tugas;
/**
 * 
 * @author Maulana Hafizul Haq-21343054
 */

public class tugas2 {
    public static void main(String[]args) {

        int x= 10, y= 23 ,z=5;
        int nilaitertinggi;

        System.out.println("number 1 = "+x);
        System.out.println("number 2 = "+y);
        System.out.println("number 3 = "+z);

        nilaitertinggi = (x>=z) ? x: z;
        nilaitertinggi= (y>=nilaitertinggi) ? y: nilaitertinggi;
        System.out.println("nilai tertingginya adalah angka = "+nilaitertinggi);
    }
    
}
