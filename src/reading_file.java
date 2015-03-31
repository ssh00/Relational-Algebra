import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;





public class reading_file {
    public static void main(String [] args) throws IOException {
    	int i = 0;
    	int i2 = 0;
    	String name1 = null;
    	String name2 = null;
        File is1 =new File("T1.txt");
        File is2 =new File("T2.txt");
        Scanner sc1 = new Scanner(is1);
        Scanner sc2 = new Scanner(is2);
        sc1.nextLine();	
        sc2.nextLine();	
       
        	 
        } 
        sc1.close();
        sc2.close();        
    }
        
}
