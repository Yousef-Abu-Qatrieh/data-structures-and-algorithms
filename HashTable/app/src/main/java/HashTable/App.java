/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package HashTable;

import HashTable.Structure.HashMap;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static com.google.common.base.Strings.repeat;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        HashMap<String,String> countryCities=new HashMap<>();
        countryCities.set("Jordan","Amman");
        countryCities.set("United States","Washington D.C.");
        countryCities.set("United Kingdom","London");
        countryCities.set("Italy","Rome");
        countryCities.set("France","Paris");
        countryCities.set("Portugal","Lisbon");
        System.out.println(countryCities.keys());
        System.out.println(countryCities.Values());
        System.out.println(convertFromNumToRoman(1900));
    }



    public static String convertFromNumToRoman(int num)
    {
        LinkedHashMap<String, Integer> romanNum = new LinkedHashMap();
        romanNum.put("M", 1000);
        romanNum.put("CM", 900);
        romanNum.put("D", 500);
        romanNum.put("CD", 400);
        romanNum.put("C", 100);
        romanNum.put("XC", 90);
        romanNum.put("L", 50);
        romanNum.put("XL", 40);
        romanNum.put("X", 10);
        romanNum.put("IX", 9);
        romanNum.put("V", 5);
        romanNum.put("IV", 4);
        romanNum.put("I", 1);
        String result = "";
        for(Map.Entry<String, Integer> entry : romanNum.entrySet())
        {
            int matches = num/entry.getValue();
            result = result+repeat(entry.getKey(), matches);
            num = num % entry.getValue();
        }
        return result;
    }
    public boolean isAnagram(String s, String t) {
        java.util.HashMap<Character,Integer> smap=new java.util.HashMap<>();
        int sl=s.length();
        int tl=t.length();
        if(sl!=tl){return false;}
        for(int i=0;i<sl;i++){
            smap.put(s.charAt(i),smap.getOrDefault(s.charAt(i),0)+1);
            smap.put(t.charAt(i),smap.getOrDefault(t.charAt(i),0)-1);
        }
        for(char c:smap.keySet()){
            if(smap.get(c)!=0){return false;}
        }

        return true;
    }
}
