
package satudua;
/**
 * 
 * @author Maulana Hafizul Haq-21343054
 */
public class RelasiDemo {

    public static void main(String[]args) {

        int i = 37;
        int j = 42;
        int k = 42;

        System.out.println("Nilai Variabel...");
        System.out.println("i = "+i);
        System.out.println("j = "+j);
        System.out.println("k = "+k);

        //Lebih Besar dari
        System.out.println("Lebih Besar dari...");
        System.out.println("i>j = "+(i>j));//false
        System.out.println("j>i = "+(j>i));//true
        System.out.println("k>j = "+(k>j));//false

        //Lebih Besar atau sama dengan
        System.out.println("Lebih Besar atau sama dengan...");
        System.out.println("i>=j = "+(i>=j));//false
        System.out.println("j>=i = "+(j>=i));//true
        System.out.println("k>=j = "+(k>=j));//true

        //Lebih kecil dari
        System.out.println("Lebih kecil dari...");
        System.out.println("i<j = "+(i<j));//true
        System.out.println("J<i = "+(j<i));//false
        System.out.println("k<j = "+(k<j));//false

          //Lebih keci atau sama dengan
          System.out.println("Lebih kecil atau sama dengan...");
          System.out.println("i<=j = "+(i<=j));//false
          System.out.println("j<=i = "+(j<=i));//true
          System.out.println("k<=j = "+(k<=j));//true


        //sama dengan
        System.out.println("sama dengan...");
         System.out.println("i==j = "+(i==j));//false
         System.out.println("k==j = "+(k<=j));//true

        
        //tidak sama dengan
        System.out.println("tidak sama dengan...");
        System.out.println("i!=j = "+(i!=j));//true
        System.out.println("k!=j = "+(k!=j));//false

    }
    
}
