package ArraysAndStrings;

public class AandS1_3 {
    public static void main(String[] args){
        String testOneString = "Mr John Smith    ";
        char[] testOne = testOneString.toCharArray();
        int length = 13;

        System.out.println(URLify(testOne, length));
    }

    private static char[] URLify(char[] input, int length){
        int outputCounter = 0;
        char[] output = new char[input.length];

        for(int i = 0; i < length; i++){
            if(input[i] != ' '){
                output[outputCounter] = input[i];
                outputCounter++;
            }
            else{
                output[outputCounter] = '%';
                output[outputCounter + 1] = '2';
                output[outputCounter + 2] = '0';
                outputCounter += 3;
            }
        }
        return output;
    }
}
