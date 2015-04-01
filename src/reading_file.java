import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
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
        Map<Integer, String> map = new HashMap<Integer, String>();
        Map<Integer, String> map2 = new HashMap<Integer, String>();
        Map<Integer, String> Union = new HashMap<Integer, String>(map);
        Map<Integer, String> same = new HashMap<Integer, String>();
        sc1.nextLine(); 
        sc2.nextLine(); 
		        while (sc1.hasNext() && sc2.hasNext() && sc1.hasNextInt() && sc2.hasNextInt()) {
		
		            i = sc1.nextInt();
		            i2 = sc2.nextInt();
		            name1 = sc1.next();
		            name2 = sc2.next();
		            map.put(i, name1);
		            map2.put(i2, name2);
		            Union.keySet().retainAll(map2.keySet());
		            System.out.println(Union);
		
		         } 
		       
            
}
       
}

