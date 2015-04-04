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
        int i = 0, i2 = 0; //initialize variables
        String name1 = null,name2 = null; //initialize variables
        File is1 =new File("T1.txt");    //reading file 1
        File is2 =new File("T2.txt");   //reading file 2
        Scanner sc1 = new Scanner(is1); //scanner for file 1
        Scanner sc2 = new Scanner(is2); //scanner 2 for file 2
        Map<Integer, String> map = new HashMap<Integer, String>(); //initializing hashmap
        Map<Integer, String> map2 = new HashMap<Integer, String>();
        Map<Integer, String> Union = new HashMap<Integer, String>();
        Map<Integer, String> inter = new HashMap<Integer, String>();
        Map<Integer, String> join = new HashMap<Integer, String>();
        Map<Integer, String> diff = new HashMap<Integer, String>();
        Map<Integer, String> diff2 = new HashMap<Integer, String>();
        sc1.nextLine(); //skip first line
        sc2.nextLine(); //skip second line
				        while (sc1.hasNext() && sc2.hasNext() && sc1.hasNextInt() && sc2.hasNextInt()) {
				
				            i = sc1.nextInt();
				            i2 = sc2.nextInt();
				            name1 = sc1.next();
				            name2 = sc2.next();
				            map.put(i, name1);
				            map2.put(i2, name2);
				            /* 
				            Comparing values
				            */
				            
				            Union.putAll(map);
				            Union.putAll(map2);
				            for (Map.Entry<Integer, String> htEntries : map.entrySet()) {
				                if(map2.containsKey(htEntries.getKey())) {
				                  join.put( htEntries.getKey(), htEntries.getValue());
				                if (map2.get(htEntries.getKey()).equals(htEntries.getValue())) {
				                  inter.put(htEntries.getKey(), htEntries.getValue());
				                } 
				                } else {
				                   diff.put( htEntries.getKey(), htEntries.getValue());
				                }
				            }
		
				            for (Map.Entry<Integer, String> diffEntries2 : map2.entrySet()) {
				                if(!map.containsKey(diffEntries2.getKey())){
				                    diff2.put(diffEntries2.getKey(), diffEntries2.getValue());
				                }
				         }
				        }
		        /* 
		        Print result 
		        */
		        System.out.println("T1 Union T2");
	            System.out.println(Union);  
	            System.out.println("T1 Intersection T2");
	            System.out.println(inter); 
	            System.out.println("T1 Join T2");
	            System.out.println(join);
	            System.out.println("T1 diff T2");
	            System.out.println(diff);
	            System.out.println("T2 diff T1");
	            System.out.println(diff2);
            

       

    }		        
}


