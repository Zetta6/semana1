package javaFun;

import java.util.HashMap;
import java.util.Set;

public class MapaHashmatique {

	public static void main(String[] args) {
		
		HashMap<String, String> trackList  = new HashMap<String, String>();

		trackList.put("Sunflower", "Desamor\n");
		trackList.put("Safe and sound", "Alegre\n");
		trackList.put("Stressed Out", "Triste\n");		
		trackList.put("Eternal Youth", "Chill\n");

        Set<String> keys = trackList .keySet();

        for(String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key));   
        }
	}
}