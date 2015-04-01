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
        int i = 0, i2 = 0;
        String name1 = null,name2 = null;
        File is1 =new File("T1.txt");
        File is2 =new File("T2.txt");
        Scanner sc1 = new Scanner(is1);
        Scanner sc2 = new Scanner(is2);
        Map<Integer, String> map = new HashMap<Integer, String>();
        Map<Integer, String> map2 = new HashMap<Integer, String>();
        Map<Integer, String> Union = new HashMap<Integer, String>();
        Map<Integer, String> inter = new HashMap<Integer, String>(map);
        Map<Integer, String> join = new HashMap<Integer, String>(map);
        Map<Integer, String> diff = new HashMap<Integer, String>(map);
        Map<Integer, String> diff2 = new HashMap<Integer, String>(map);
        sc1.nextLine(); 
        sc2.nextLine(); 
		        while (sc1.hasNext() && sc2.hasNext() && sc1.hasNextInt() && sc2.hasNextInt()) {
		
		            i = sc1.nextInt();
		            i2 = sc2.nextInt();
		            name1 = sc1.next();
		            name2 = sc2.next();
		            map.put(i, name1);
		            map2.put(i2, name2);
		            Union.putAll(map);
		            Union.putAll(map2);
		            for (Map.Entry<Integer, String> htEntries : map.entrySet()) {
		                if(map2.containsKey(htEntries.getKey()) && map2.get(htEntries.getKey()).equals(htEntries.getValue())){
		                    inter.put( htEntries.getKey(), htEntries.getValue());
		                }
		            }
		            for (Map.Entry<Integer, String> joinEntries : map.entrySet()) {
			                if(map2.containsKey(joinEntries.getKey())){
			                    join.put( joinEntries.getKey(), joinEntries.getValue());
			                }
		            }
			        for (Map.Entry<Integer, String> diffEntries : map.entrySet()) {
				                if(!map2.containsKey(diffEntries.getKey())){
				                    diff.put( diffEntries.getKey(), diffEntries.getValue());
				                } 
			        }
				    for (Map.Entry<Integer, String> diffEntries2 : map2.entrySet()) {
					                if(!map.containsKey(diffEntries2.getKey())){
					                    diff2.put( diffEntries2.getKey(), diffEntries2.getValue());
					                }  
		            }
		        }
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


