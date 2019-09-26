package ArraysAndStrings;

import java.util.HashSet;

public class AandS1_1 {
    public static void main(String[] args){
        String test1 = "Hello";
        String test2 = "abcdefghijklmnopqrstuvwxyz";

        System.out.println("Test one: " + isUnique(test1));
        System.out.println("Test two: " + isUnique(test2));
    }

    private static boolean isUnique(String input){

        HashSet<Object> set = new HashSet<>();

        for(int i = 0; i < input.length(); i++){
            if(set.contains(input.charAt(i))){
                return false;
            }

            set.add(input.charAt(i));
        }

        return true;
    }
}
