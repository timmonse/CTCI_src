package ArraysAndStrings;

public class AandS1_4 {
    public static void main(String[] args){
        System.out.println(palindromePermutation("Tact Coa"));
        System.out.println(palindromePermutation("Tact Coal"));
        System.out.println(palindromePermutation("Tact Coallffhhssjj ss cc aa dd"));
    }

    static boolean palindromePermutation(String s){
        int[] letters = new int[26];

        String fixed = s.toLowerCase();

        boolean odd = false;

        for(int i = 0; i < fixed.length(); i++){
            char currentChar;
            int adjustedChar;
            currentChar = fixed.charAt(i);
            adjustedChar = (int) currentChar - 97;

            if(adjustedChar != -65){
                letters[adjustedChar]++;
            }
        }

        for(int j = 0; j < 26; j++){
            if ((letters[j] % 2 != 0) && odd){
                return false;
            }
            else if(letters[j] % 2 != 0){
                odd = true;
            }
        }

        return true;
    }
}
