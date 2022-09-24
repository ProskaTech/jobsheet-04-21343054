// percobaan 4 penggunaan operator logika dan boolean and

package satudua;
/**
 * 
 * @author Maulana Hafizul Haq-21343054
 */
public class TestAND{
    public static void main(String[]args) {
        int i =0;
        int j=10;
        boolean test = true;

        //demostrasi &&
        test = (i>j) && (j++ >9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
        
        //demonstrasi &
        test = (i>j) & (j++>9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
        
    }

}