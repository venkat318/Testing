package example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Basket {

    public static void main(String[] args) {

        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        int lineNo=0;
        int totalCount=0;
        Map<String,Integer> map=new HashMap<String, Integer>();

        TreeMap<String,Integer> colorMap=new TreeMap<String, Integer>();

        HashMap<String,Integer>  threeDaysMap= new HashMap<String, Integer>();
        if(args.length >0)
        System.out.println("the file at location "+args[0]);
        System.out.println("-------------------");

        try {
            br = new BufferedReader(new FileReader(args[0]));

            while ((line = br.readLine()) != null) {

                if(lineNo!=0) {

                    // use comma as separator
                    String[] row = line.split(cvsSplitBy);
                    if(map.containsKey(row[0])){
                        int presentCount=map.get(row[0]);
                        map.put(row[0],presentCount+Integer.parseInt(row[1]));
                        totalCount+=Integer.parseInt(row[1]);
                    }
                    else{
                        map.put(row[0],Integer.parseInt(row[1]));
                        totalCount+=Integer.parseInt(row[1]);
                    }

                    String fruitCharectar=row[0]+":"+row[2]+","+row[3];

                    if(colorMap.containsKey(fruitCharectar)){
                        int presentCount=colorMap.get(fruitCharectar);
                        colorMap.put(fruitCharectar,presentCount+Integer.parseInt(row[1]));
                    }
                    else{
                        colorMap.put(fruitCharectar,Integer.parseInt(row[1]));
                    }


                    if(Integer.parseInt(row[4])>3){
                        if(threeDaysMap.containsKey(row[0])){
                            int presentCount=threeDaysMap.get(row[0]);
                            threeDaysMap.put(row[0],presentCount+Integer.parseInt(row[1]));

                        }
                        else{
                            threeDaysMap.put(row[0],Integer.parseInt(row[1]));

                        }
                    }


                }
                lineNo++;

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("Total Count: "+totalCount);

        System.out.println("Types of Fruit: "+ map.size());

        System.out.println("-------------------------");
        System.out.println("The number of each type of fruit in descending order");

       
        TreeMap<String, Integer> sortedMap = sortMapByValue(map);
        for (String k:sortedMap.keySet()){
            System.out.println(k+": "+map.get(k));
        }
        System.out.println("--------------------------");
        System.out.println("The characteristics (size, color, shape, etc.) of each fruit by type");
        for(String s:colorMap.keySet()){
            System.out.println(colorMap.get(s)+" "+s);
        }
        System.out.println("-------------------------");
        
        for (String k:threeDaysMap.keySet()){
            System.out.print(threeDaysMap.get(k)+" "+k+"  " );

        }

        System.out.println("are over 3 days old");

        
    }
    
    public static TreeMap<String, Integer> sortMapByValue(Map<String, Integer> map){ 
    	Comparator<String> comparator = new ValueComparator(map); 
    	TreeMap<String, Integer> result = new TreeMap<String, Integer>(comparator); 
    	result.putAll(map); return result; 
    }
   
    
}
class ValueComparator implements Comparator<String>{
	Map<String, Integer> map = new TreeMap<>();
	
	public ValueComparator(Map<String, Integer> map2) {
		this.map.putAll(map2);
	}

	@Override
	public int compare(String s1, String s2) {
		if(map.get(s1) >= map.get(s2)){ 
    		return -1; 
    	}else{ 
    			return 1; 
    	}	
	}
	
}
