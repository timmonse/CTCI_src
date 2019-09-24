package ArraysAndStrings;

import java.util.HashMap;

public class AandS1_2 {

    public static void main(String[] args){
        String one = "test";
        String two = "etts";

        String three = "PNEUMONOULTRAMICROSCOPICSILICOVOLCANOCONIOSIS";
        String four =  "SCPNOACOSONLSNMVLCCOOLOUMIIOIIISTRRPOICAOUNCE";

        System.out.println("Test One: " + checkPermutation(one,two));
        System.out.println("Test Two: " + checkPermutation(three,four));
        System.out.println("Test Three: " + checkPermutation(one,four));

    }

    private static boolean checkPermutation(String one, String two){
        HashMap<Object, Integer> mapOne = new HashMap<>();
        HashMap<Object, Integer> mapTwo = new HashMap<>();

        //Put the char's from one and their appearance amounts in a HashMap
        for(int i = 0; i < one.length(); i++){
            char currentChar = one.charAt(i);
            if(mapOne.containsKey(currentChar)){
                int amnt = mapOne.get(currentChar);
                amnt++;
                mapOne.replace(currentChar, amnt);
            }
            else{
                mapOne.put(currentChar, 1);
            }
        }

        //Put the char's from two and their appearance amounts in a HashMap
        for(int j = 0; j < two.length(); j++){
            char currentChar = two.charAt(j);
            if(mapTwo.containsKey(currentChar)){
                int amnt = mapTwo.get(currentChar);
                amnt++;
                mapTwo.replace(currentChar, amnt);
            }
            else{
                mapTwo.put(currentChar, 1);
            }
        }

        return mapOne.equals(mapTwo);
    }
}
