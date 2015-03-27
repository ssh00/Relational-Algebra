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
    	String IntersectionName = null;
    	int IntersectionId = 0;
        File is1 =new File("T1.txt");
        File is2 =new File("T2.txt");
        Scanner sc1 = new Scanner(is1);
        Scanner sc2 = new Scanner(is2);
        sc1.nextLine();	
        sc2.nextLine();	
        
        System.out.println("ID" +" "+"Name");
        while (sc1.hasNext() && sc2.hasNext() && sc1.hasNextInt() && sc2.hasNextInt()) {
        	
                i = sc1.nextInt();
                i2 = sc2.nextInt();
        	    name1 = sc1.next();
        	    name2 = sc2.next();
        	 
        	 if (name1.equals(name2) && i == i2){
        		 IntersectionName = name1;
        	     IntersectionId = i;
        		 System.out.println(name1 +"   "+ i);
            	 }
        	 else if (!name1.equals(name2) && i != i2) {
        		 System.out.println(name1 +"   "+ i);
        		 System.out.println(name2 +"   "+ i2);
             }
        	 
        	 
        }      

        sc1.close();
        sc2.close();        
    
    }
        
}
